import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import org.apache.commons.lang.ClassUtils;
import org.reflections.Reflections;
import org.reflections.scanners.MethodParameterNamesScanner;
import org.reflections.scanners.MethodParameterScanner;
import org.reflections.scanners.SubTypesScanner;
import ru.dmartynov.jiup.sdk.core.components.containers.Container;

import java.beans.Transient;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by dmartynov on 02.02.17.
 */
public class Main {

    private static Map<Class, String> schemaTypes = new HashMap<>();

    static {
        schemaTypes.put(String.class, "xsd:string");
        schemaTypes.put(Boolean.class, "xsd:boolean");
        schemaTypes.put(boolean.class, "xsd:boolean");
        schemaTypes.put(Integer.class, "xsd:integer");
        schemaTypes.put(int.class, "xsd:integer");
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.buildAttrsSchema();
    }

    private List<Class> supportedClasses = Arrays.asList(String.class, Boolean.class, Integer.class, Enum.class);
    private final String SETTER_PREFIX = "set";
    private final String XSD_SCHEMA_URI = "http://www.w3.org/2001/XMLSchema";

    private void buildAttrsSchema() throws Exception {
        Reflections reflections = new Reflections("ru.dmartynov.jiup.sdk.core.attributes",
                new SubTypesScanner(false), new MethodParameterNamesScanner(), new MethodParameterScanner());

        Set<String> attrInterfaces = reflections.getAllTypes().stream().filter(clazz -> {
            try {
                Class<?> aClass = Class.forName(clazz);
                return aClass.isInterface()/* && aClass.getInterfaces().length == 0*/;
            } catch (ClassNotFoundException e) {
                return false;
            }
        }).collect(Collectors.toSet());

        Map<Class, Map<String, Map<String, List<Class>>>> desc = new HashMap<>();

        for (String type : attrInterfaces) {
            Class clazz = Class.forName(type);

            List<Method> setters = Arrays.stream(clazz.getMethods())
                    .filter(method -> !method.isAnnotationPresent(Transient.class))
                    .filter(method -> method.getDeclaringClass() == clazz)
                    .filter(method -> method.getName().startsWith(SETTER_PREFIX))
                    .filter(method -> method.getParameterCount() > 0)
                    .filter(method -> Arrays.stream(method.getParameterTypes())
                            .allMatch(paramType -> supportedClasses.stream()
                                    .anyMatch(supportedType -> ClassUtils.isAssignable(paramType, supportedType, true))))
                    .collect(Collectors.toList());
            if (setters.size() == 0)
                continue;

            Map<String, Map<String, List<Class>>> attrDesc = desc.computeIfAbsent(clazz, aClass -> new HashMap<>());

            setters.forEach(setter -> {
                Map<String, List<Class>> setterParamsMap = attrDesc.computeIfAbsent(setter.getName(), s -> new HashMap<>());
                Arrays.stream(setter.getParameters())
                        .forEach(parameter -> setterParamsMap
                                .computeIfAbsent(parameter.getName(), s -> new ArrayList<>()).add(parameter.getType()));
            });
        }

        Element schema = new Element("xsd:schema", XSD_SCHEMA_URI);


        desc.forEach((attrClass, attrGroupDesc) -> {
            Element attributeGroup = new Element("xsd:attributeGroup", XSD_SCHEMA_URI);
            attributeGroup.addAttribute(new Attribute("name", attrClass.getSimpleName()));

            attrGroupDesc.forEach((attrName, stringListMap) -> stringListMap.forEach((attrField, attrTypes) -> {
                Element attribute = new Element("xsd:attribute", XSD_SCHEMA_URI);
                attribute.addAttribute(new Attribute("name", attrName.substring(SETTER_PREFIX.length()) + "." + attrField));
                if (attrTypes.size() == 1 && !attrTypes.get(0).isEnum()) {
                    attribute.addAttribute(new Attribute("type", schemaTypes.get(attrTypes.get(0))));
                } else if (attrTypes.size() == 1 && attrTypes.get(0).isEnum()) {
                    Element simpleType = new Element("xsd:simpleType", XSD_SCHEMA_URI);
                    attribute.appendChild(simpleType);
                    Element restriction = new Element("xsd:restriction", XSD_SCHEMA_URI);
                    simpleType.appendChild(restriction);
                    restriction.addAttribute(new Attribute("base", "xsd:string"));
                    Class en = attrTypes.get(0);
                    Arrays.stream(en.getEnumConstants()).forEach(o -> {
                        Element enumeration = new Element("xsd:enumeration", XSD_SCHEMA_URI);
                        restriction.appendChild(enumeration);
                        enumeration.addAttribute(new Attribute("value", o.toString()));
                    });
                } else {
                    Element rootSimpleType = new Element("xsd:simpleType", XSD_SCHEMA_URI);
                    attribute.appendChild(rootSimpleType);
                    Element union = new Element("xsd:union", XSD_SCHEMA_URI);
                    rootSimpleType.appendChild(union);
                    attrTypes.forEach(attrType -> {
                        Element simpleType = new Element("xsd:simpleType", XSD_SCHEMA_URI);
                        union.appendChild(simpleType);
                        Element restriction = new Element("xsd:restriction", XSD_SCHEMA_URI);
                        simpleType.appendChild(restriction);
                        if (attrType.isEnum()) {
                            restriction.addAttribute(new Attribute("base", "xsd:string"));
                            Arrays.stream(attrType.getEnumConstants()).forEach(o -> {
                                Element enumeration = new Element("xsd:enumeration", XSD_SCHEMA_URI);
                                restriction.appendChild(enumeration);
                                enumeration.addAttribute(new Attribute("value", o.toString()));
                            });
                        } else {
                            restriction.addAttribute(new Attribute("base", schemaTypes.get(attrType)));
                        }
                    });

                }

                attributeGroup.appendChild(attribute);
            }));

            schema.appendChild(attributeGroup);
        });


        Reflections componentsRef = new Reflections("ru.dmartynov.jiup.sdk.core.components");
        Set<Class<? extends Container>> containers = componentsRef.getSubTypesOf(Container.class);

        containers.forEach(containerClass -> {

        });



        Document document = new Document(schema);
        String s = document.toXML();
        System.out.println(s);

    }
}
