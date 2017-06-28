package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

public interface PlacementAttr {
    default void setPlacement(Placement placement) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "PLACEMENT", placement.name());
    }
}
