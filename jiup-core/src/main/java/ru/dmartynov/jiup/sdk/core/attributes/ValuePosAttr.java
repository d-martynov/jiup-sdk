package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface ValuePosAttr {
    default void setValuePos(int pos) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "VALUEPOS", pos + "");
    }

}
