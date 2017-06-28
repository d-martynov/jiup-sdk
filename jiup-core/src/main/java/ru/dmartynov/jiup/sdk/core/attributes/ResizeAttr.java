package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface ResizeAttr {
    default void setResize(boolean resize) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "RESIZE", resize ? "YES" : "NO");
    }
}
