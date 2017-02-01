package ru.dmartynov.jiup.sdk.nativ.callbacks.tabs;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 01.02.17.
 */
public interface RIGHTCLICK_CB extends Icallback {

    /**
     * Callback called when the user clicks on some tab using the right mouse button (since 3.10).
     * @param ih identifier of the element that activated the event.
     * @param pos the tab position
     * @return
     */
    int function(Ihandle ih, int pos);

}
