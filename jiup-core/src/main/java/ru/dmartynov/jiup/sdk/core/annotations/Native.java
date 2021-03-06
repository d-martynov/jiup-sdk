package ru.dmartynov.jiup.sdk.core.annotations;

import ru.dmartynov.jiup.sdk.nativ.Icallback;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Дмитрий on 04.10.2015.
 */

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Native {
    Class<? extends Icallback> value();

    NativeMap[] callbackMap() default @NativeMap(targetParamIndex = -1, nativeParamIndex = -1);
}
