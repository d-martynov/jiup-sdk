package ru.dmartynov.jiup.sdk.nativ.callbacks.tabs;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 01.02.17.
 */
public interface TABCHANGE_CB extends Icallback{

    /**
     * TABCHANGE_CB: Callback called when the user changes the current tab.
     *
     * @param ih identifier of the element that activated the event.
     * @param newTab the new tab selected by the user
     * @param oldTab the previously selected tab
     * @return
     */
    int function(Ihandle ih, Ihandle newTab, Ihandle oldTab);
}
