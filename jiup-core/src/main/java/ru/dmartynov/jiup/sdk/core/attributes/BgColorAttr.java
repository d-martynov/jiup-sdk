package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface BgColorAttr {
    default void setBgColor(Color color) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "BGCOLOR", color.getR() + " " + color.getG() + " " + color.getB());
    }

    default void setBgColor(String hex) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "BGCOLOR", hex);

    }
}
