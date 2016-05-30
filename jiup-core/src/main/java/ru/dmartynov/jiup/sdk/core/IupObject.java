package ru.dmartynov.jiup.sdk.core;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.annotations.TypeTransformer;
import ru.dmartynov.jiup.sdk.core.components.Size;
import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;
import ru.dmartynov.jiup.sdk.nativ.Iup;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Дмитрий on 02.10.2015.
 */

public abstract class IupObject<ListenerClass> {
    public static Iup $ = Iup.INST;

    private Ihandle ihandle;

    public IupObject(Ihandle ihandle) {
        this.ihandle = ihandle;
    }

    public Ihandle getIhandle() {
        return ihandle;
    }


    public void setSize(Size width, Size height) {
        setSize(width.name(), height.name());
    }

    public void setSize(int width, int height) {
        setSize(width + "", height + "");
    }

    public void setSize(int width, Size height) {
        setSize(width + "", height.name());
    }

    public void setSize(Size width, int height) {
        setSize(width.name(), height + "");
    }

    public int getHeight() {
        return Integer.valueOf($.IupGetAttribute(getIhandle(), "SIZE").split("x")[1]);
    }

    public int getWidth() {
        return Integer.valueOf($.IupGetAttribute(getIhandle(), "SIZE").split("x")[0]);
    }

    private void setSize(String width, String height) {
        $.IupSetAttribute(ihandle, "SIZE", width + "x" + height);
    }


    public <T extends ListenerClass> void addListener(final T listener) {
        Class<?> listenerClass = listener.getClass().getInterfaces()[0];
        Native nativeAnnotation = listenerClass.getAnnotation(Native.class);
        if (nativeAnnotation == null)
            return;

        final Class<? extends Icallback> icallbackClass = nativeAnnotation.value();
        final NativeMap[] nativeMaps = nativeAnnotation.callbackMap();
        final Method targetMethod = listenerClass.getMethods()[0];

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (icallbackClass.getMethods()[0].getName().equals(method.getName())) {
                    Object[] parms = mapParams(nativeMaps, args);
                    return targetMethod.invoke(listener, parms);
                }
                return method.invoke(listener, args);
            }
        };


        Icallback icallbackProxy = (Icallback) Proxy.newProxyInstance(icallbackClass.getClassLoader(), new Class[]{icallbackClass},
                invocationHandler);

        Iup.INST.IupSetCallback(getIhandle(), icallbackClass.getSimpleName(), icallbackProxy);
    }

    private Object[] mapParams(NativeMap[] callbackMap, Object[] nativeParams) throws IllegalAccessException, InstantiationException {
        if (callbackMap.length == 1 && callbackMap[0].nativeParamIndex() == -1 && callbackMap[0].targetParamIndex() == -1)
            return null;

        Object[] result = new Object[callbackMap.length];


        for (NativeMap cm : callbackMap) {
            Class<? extends TypeTransformer> typeTransformerClass = cm.typeTransformer();
            if (typeTransformerClass == TypeTransformer.class) {
                result[cm.targetParamIndex()] = nativeParams[cm.nativeParamIndex()];
            } else {
                TypeTransformer typeTransformer = typeTransformerClass.newInstance();
                result[cm.targetParamIndex()] = typeTransformer.transform(nativeParams[cm.nativeParamIndex()]);
            }
        }

        return result;
    }
}
