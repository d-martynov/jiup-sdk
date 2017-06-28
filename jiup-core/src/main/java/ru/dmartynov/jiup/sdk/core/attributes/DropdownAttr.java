package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface DropdownAttr {
    default void setDropdown(boolean dropdown) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "DROPDOWN", dropdown ? "YES" : "NO");
    }

}
