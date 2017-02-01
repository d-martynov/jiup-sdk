package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.attributes.TabsAttrs;
import ru.dmartynov.jiup.sdk.core.components.Component;

/**
 * Created by dz on 01.02.17.
 */
public class Tabs extends Container implements TabsAttrs {

    public Tabs() {
        super($.IupTabs());
    }

    @Override
    public void insert(Component child, int position) {
        throw new RuntimeException("method not support in current container");
    }


}
