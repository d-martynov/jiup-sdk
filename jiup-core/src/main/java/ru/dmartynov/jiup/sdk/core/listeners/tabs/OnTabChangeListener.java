package ru.dmartynov.jiup.sdk.core.listeners.tabs;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.listeners.markers.TabsListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.tabs.TABCHANGE_CB;

/**
 * Created by dz on 01.02.17.
 */
@Native(value = TABCHANGE_CB.class)
public interface OnTabChangeListener extends TabsListener{

    int onTabChange();

}
