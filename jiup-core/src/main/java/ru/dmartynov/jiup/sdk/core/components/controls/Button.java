package ru.dmartynov.jiup.sdk.core.components.controls;


import ru.dmartynov.jiup.sdk.core.attributes.*;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ButtonListener;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Button extends Control<ButtonListener> implements ActiveAttr, SizeAttr, AlignmentAttr, BgColorAttr, CanFocusAttr {

    public Button(String title) {
        super($.IupButton(title, null));
    }

    public Button() {
        super($.IupButton(null, null));
    }
}
