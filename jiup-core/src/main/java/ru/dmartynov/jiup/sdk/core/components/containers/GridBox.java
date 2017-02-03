package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.GridBoxAttrs;

/**
 * Created by dz on 03.02.17.
 */
public class GridBox extends Container implements GridBoxAttrs {

    public GridBox() {
        super($.IupGridBox());
    }

}
