package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface CursorAttr {
    default void setCursor(Cursor cursor) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "CURSOR", cursor.name());
    }

}
