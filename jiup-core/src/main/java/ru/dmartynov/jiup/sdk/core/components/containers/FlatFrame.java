package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.BgColorAttr;
import ru.dmartynov.jiup.sdk.core.components.Control;

public class FlatFrame extends Container implements BgColorAttr {
    public FlatFrame() {
        super($.IupFlatFrame());
    }

    public FlatFrame(Control control) {
        super($.IupFlatFrame(control.getIhandle()));
    }
}
