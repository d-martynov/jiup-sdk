package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.FlatButtonListener;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public class FlatButton extends Control<FlatButtonListener> {
    public FlatButton() {
        super($.IupFlatButton(null));
    }

    public FlatButton(String title) {
        super($.IupFlatButton(title));
    }
}
