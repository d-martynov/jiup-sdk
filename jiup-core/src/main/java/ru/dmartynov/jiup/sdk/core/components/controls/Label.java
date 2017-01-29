package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.attributes.*;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.LabelListener;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public class Label extends Control<LabelListener> implements LabelAttr {
    public Label() {
        super($.IupLabel(null));
    }

    public Label(String title) {
        super($.IupLabel(title));
    }
}
