package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface MinSizeAttr {
    default void setMinSize(int width, int height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "MINSIZE", width + "x" + height);
    }
}
