package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface MaxSizeAttr {
    default void setMaxSize(int width, int height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "MAXSIZE", width + "x" + height);
    }
}
