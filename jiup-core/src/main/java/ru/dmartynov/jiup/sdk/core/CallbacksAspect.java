package ru.dmartynov.jiup.sdk.core;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import ru.dmartynov.jiup.sdk.core.annotations.NativeCallback;
import ru.dmartynov.jiup.sdk.core.annotations.NativeCallbackMap;
import ru.dmartynov.jiup.sdk.core.listeners.BaseListener;
import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Iup;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Дмитрий on 04.10.2015.
 */

@Aspect
public class CallbacksAspect {
    @Before("execution(public void ru.dmartynov.jiup.sdk.core.IupObject+.set*(..)) && target(target) && args(listener)")
    public void onNativeCallback(JoinPoint joinPoint, final IupObject target, final BaseListener listener) throws Exception {
        Class<?> aClass = Class.forName("org.aspectj.runtime.reflect.CodeSignatureImpl");
        final Field parameterTypes = aClass.getDeclaredField("parameterTypes");
        parameterTypes.setAccessible(true);
        Class[] paramTypes = (Class[]) parameterTypes.get(joinPoint.getSignature());
        final Class<? extends BaseListener> listenerClass = paramTypes[0];

        NativeCallback nativeCallbackAnnotation;
        if ((nativeCallbackAnnotation = listenerClass.getAnnotation(NativeCallback.class)) == null)
            return;


        final Class<? extends Icallback> icallbackClass = nativeCallbackAnnotation.value();
        final NativeCallbackMap[] nativeCallbackMaps = nativeCallbackAnnotation.callbackMap();
        final Method targetMethod = listenerClass.getMethods()[0];

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (icallbackClass.getMethods()[0].getName().equals(method.getName())) {
                    Object[] parms = mapParams(nativeCallbackMaps, args);
                    return targetMethod.invoke(listener, parms);
                }
                return method.invoke(listener, args);
            }
        };


        Icallback icallbackProxy = (Icallback) Proxy.newProxyInstance(icallbackClass.getClassLoader(), new Class[]{icallbackClass},
                invocationHandler);

        Iup.INST.IupSetCallback(target.getIhandle(), icallbackClass.getSimpleName(), icallbackProxy);

    }

    private Object[] mapParams(NativeCallbackMap[] callbackMap, Object[] nativeParams) {
        if (callbackMap.length == 1 && callbackMap[0].nativeParamIndex() == -1 && callbackMap[0].targetParamIndex() == -1)
            return null;

        Object[] result = new Object[callbackMap.length];


        for (int i = 0; i < callbackMap.length; i++) {
            NativeCallbackMap cm = callbackMap[i];
            result[cm.targetParamIndex()] = nativeParams[cm.nativeParamIndex()];
        }

        return result;
    }


}
