package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.BgColorAttr;
import ru.dmartynov.jiup.sdk.core.attributes.BorderAttr;
import ru.dmartynov.jiup.sdk.core.attributes.DecorationAttr;
import ru.dmartynov.jiup.sdk.core.components.Control;

public class BackgroundBox extends Container implements BgColorAttr, BorderAttr, DecorationAttr {
    public BackgroundBox() {
        super($.IupBackgroundBox(null));
    }

    public BackgroundBox(Control control) {
        super($.IupBackgroundBox(control.getIhandle()));
    }
}
