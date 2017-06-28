package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.RasterSizeAttr;
import ru.dmartynov.jiup.sdk.core.attributes.SizeAttr;

/**
 * Created by dmartynov on 14.06.16.
 */
public class VBox extends Container implements SizeAttr, RasterSizeAttr {
    public VBox() {
        super($.IupVbox());
    }
}
