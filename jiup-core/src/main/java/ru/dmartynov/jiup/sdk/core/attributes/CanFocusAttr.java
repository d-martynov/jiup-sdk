package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface CanFocusAttr {
    default void setCanFocus(boolean canFocus) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "CANFOCUS", canFocus ? "YES" : "NO");

    }
}
