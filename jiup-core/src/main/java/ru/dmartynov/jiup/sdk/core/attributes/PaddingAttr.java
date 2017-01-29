package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface PaddingAttr {
    default void setPadding(int horizontal, int vertical) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "PADDING", horizontal + "x" + vertical);
    }
}
