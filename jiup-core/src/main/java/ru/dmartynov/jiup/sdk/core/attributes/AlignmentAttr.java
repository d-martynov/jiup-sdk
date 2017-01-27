package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface AlignmentAttr {
    default void setAlignment(Alignment hAlignment, Alignment vAlignment) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "ALIGNMENT", hAlignment.name() + ":" + vAlignment.name());
    }

}
