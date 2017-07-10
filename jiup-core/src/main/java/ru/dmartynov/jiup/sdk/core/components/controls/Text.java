package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.attributes.CommonAttrs;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.TextListener;

public class Text extends Control<TextListener> implements CommonAttrs {
    public Text() {
        super($.IupText(null));
    }
}
