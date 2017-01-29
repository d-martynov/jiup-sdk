package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface FgColorAttr {
    default void setFgColor(Color color) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "FGCOLOR", color.getR() + " " + color.getG() + " " + color.getB());
    }

    default void setFgColor(String hex) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "FGCOLOR", hex);
    }
}
