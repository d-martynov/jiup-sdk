package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import java.beans.Transient;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface SizeAttr {
    default void setSize(int width, int height) {
        setSize(width + "", height + "");
    }


    default int getHeight() {
        return Integer.valueOf($.IupGetAttribute(((IupObject) this).getIhandle(), "SIZE").split("x")[1]);
    }

    default int getWidth() {
        return Integer.valueOf($.IupGetAttribute(((IupObject) this).getIhandle(), "SIZE").split("x")[0]);
    }

    @Transient
    default void setSize(String width, String height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SIZE", width + "x" + height);
    }
}
