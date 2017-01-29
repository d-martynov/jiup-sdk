package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface ImPressBorderAttr {
    default void setImpressBorder(boolean impressBorder) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "IMPRESSBORDER", impressBorder ? "YES" : "NO");
    }
}
