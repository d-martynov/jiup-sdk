package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface DecorationAttr {
    default void setDecoration(boolean decoration) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "DECORATION", decoration ? "YES" : "NO");
    }

    default void setDecorSize(int width, int height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "DECORSIZE", width + "x" + height);
    }

    default void setDecorOffset(int x, int y) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "DECOROFFSET", x + "x" + y);

    }
}
