package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.components.Control;

/**
 * Created by dmartynov on 14.06.16.
 */
public class DetachBox extends Control {
    public DetachBox(Control child) {
        super($.IupDetachBox(child.getIhandle()));
    }
}
