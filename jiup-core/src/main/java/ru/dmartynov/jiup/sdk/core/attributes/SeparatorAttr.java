package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface SeparatorAttr {
    default void setSeparator(Separator separator) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SEPARATOR", separator.name());
    }
}
