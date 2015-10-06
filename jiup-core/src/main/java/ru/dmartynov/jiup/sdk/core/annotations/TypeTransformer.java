package ru.dmartynov.jiup.sdk.core.annotations;

/**
 * Created by d.martynov on 05.10.2015.
 */
public interface TypeTransformer<FromType, ToType> {
    ToType transform(FromType val);
}
