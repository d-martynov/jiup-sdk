package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface NMarginAttr {
    /**
     * Defines a margin in pixels.
     * Its value has the format "widthxheight",
     * where width and height are integer values corresponding to the horizontal and vertical margins,
     * respectively. Default: "0x0" (no margin).
     * non inheritable
     *
     * @param width
     * @param height
     */
    default void setNMargin(int width, int height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "NMARGIN", width + "x" + height);
    }
}
