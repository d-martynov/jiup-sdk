package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface BorderAttr {
    default void setBorder(boolean border) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "BORDER", border ? "YES" : "NO");
    }
}
