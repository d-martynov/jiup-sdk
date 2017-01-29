package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface RasterSizeAttr {
    default void setRasterSize(int width, int height) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "RASTERSIZE", width + "x" + height);

    }
}
