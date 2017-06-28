package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.TabsAttrs;
import ru.dmartynov.jiup.sdk.core.components.Component;
import ru.dmartynov.jiup.sdk.core.components.Control;

/**
 * Created by dz on 01.02.17.
 */
public class TabsVertical extends Container implements TabsAttrs{

    public TabsVertical(Control children) {
        super($.IupTabsv(null));
    }

    @Override
    public void insert(Component child, int position) {
        throw new RuntimeException("method not support in current container");
    }
}
