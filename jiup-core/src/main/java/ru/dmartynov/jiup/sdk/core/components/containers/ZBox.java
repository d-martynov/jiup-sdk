package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.ValuePosAttr;

public class ZBox extends Container implements ValuePosAttr {
    public ZBox() {
        super($.IupZbox());
    }
}
