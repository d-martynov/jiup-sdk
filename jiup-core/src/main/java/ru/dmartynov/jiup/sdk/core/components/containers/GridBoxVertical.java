package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.GridBoxAttrs;
import ru.dmartynov.jiup.sdk.core.components.Control;

/**
 * Created by dz on 03.02.17.
 */
public class GridBoxVertical extends Container implements GridBoxAttrs{

    public GridBoxVertical(Control control) {
        super($.IupGridBoxv(control.getIhandle()));
    }
}
