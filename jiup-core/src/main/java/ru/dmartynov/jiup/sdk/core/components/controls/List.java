package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.attributes.CommonAttrs;
import ru.dmartynov.jiup.sdk.core.attributes.DropdownAttr;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ListListener;

public class List extends Control<ListListener> implements CommonAttrs, DropdownAttr {
    public List() {
        super($.IupList(null));
    }

    public void setValues(Iterable<String> values) {
        $.IupSetAttribute(getIhandle(), "1", null);
        if (values != null) {
            int i = 0;
            for (String value : values) {
                $.IupSetAttribute(getIhandle(), (++i) + "", value);
            }
        }
    }
}
