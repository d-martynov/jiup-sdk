package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface SizeAttr {
    default void setSize(Size width, Size height) {
        setSize(width.name(), height.name());
    }

    default void setSize(int width, int height) {
        setSize(width + "", height + "");
    }

    default void setSize(int width, Size height) {
        setSize(width + "", height.name());
    }

    default void setSize(Size width, int height) {
        setSize(width.name(), height + "");
    }

    default int getHeight() {
        return Integer.valueOf($.IupGetAttribute(((IupObject) this).getIhandle(), "SIZE").split("x")[1]);
    }

    default int getWidth() {
        return Integer.valueOf($.IupGetAttribute(((IupObject) this).getIhandle(), "SIZE").split("x")[0]);
    }

    default void setSize(String width, String height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "SIZE", width + "x" + height);
    }
}
