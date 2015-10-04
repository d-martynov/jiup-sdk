package ru.dmartynov.jiup.sdk.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Дмитрий on 05.10.2015.
 */

@Target(value = ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NativeCallbackMap {
    int nativeParamIndex();
    int targetParamIndex();


}
