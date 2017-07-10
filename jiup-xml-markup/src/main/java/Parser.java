import nu.xom.*;
import org.reflections.Reflections;
import org.reflections.scanners.MethodParameterNamesScanner;
import ru.dmartynov.jiup.sdk.core.components.Component;
import ru.dmartynov.jiup.sdk.core.components.containers.Container;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    static {
        System.loadLibrary("iup");
    }

    private static Reflections reflections;

    public static void main(String[] args) throws ParsingException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        reflections = new Reflections("ru.dmartynov.jiup.sdk.core.attributes", new MethodParameterNamesScanner());
        InputStream resourceAsStream = Parser.class.getClassLoader().getResourceAsStream("test_window.xml");
        Builder parser = new Builder();
        Document doc = parser.build(resourceAsStream);


        Container bind = (Container) bind(doc.getRootElement());


        System.out.println();
    }

    private static Component bind(Element element) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String namespaceURI = element.getNamespaceURI();
        String pckg = namespaceURI.split("http://")[1];

        Class<?> aClass = Class.forName(pckg + "." + element.getLocalName());
        Component component = (Component) aClass.newInstance();

        Map<String, List<Map.Entry<String, String>>> params = new HashMap<>();
        for (int i = 0; i < element.getAttributeCount(); i++) {
            Attribute attribute = element.getAttribute(i);
            if (!"http://ru.dmartynov.jiup.sdk.core.attributes".equals(attribute.getNamespaceURI()))
                continue;

            String attrName = attribute.getLocalName();
            String[] split = attrName.split("\\.");
            List<Map.Entry<String, String>> param = params.computeIfAbsent(split[0], k -> new ArrayList<>());
            Map.Entry<String, String> paramVal = new AbstractMap.SimpleEntry<>(split[1], attribute.getValue());
            param.add(paramVal);
        }
        Method[] methods = aClass.getMethods();
        for (String paramName : params.keySet()) {
            List<Map.Entry<String, String>> param = params.get(paramName);
            List<Method> setters = Stream.of(methods)
                    .filter(method -> method.getName().equals("set" + paramName))
                    .filter(setter -> reflections.getMethodParamNames(setter).parallelStream()
                            .allMatch(methodParamName -> param.parallelStream()
                                    .anyMatch(entry -> entry.getKey().equals(methodParamName))))
                    .collect(Collectors.toList());

            System.out.println(setters.size());


        }


        if (element.getChildElements().size() > 0 && component instanceof Container) {
            Container container = (Container) component;
            for (int i = 0; i < element.getChildElements().size(); i++) {
                Element child = element.getChildElements().get(i);
                Component bind = bind(child);
                container.append(bind);
            }
        }

        return component;
    }


}
