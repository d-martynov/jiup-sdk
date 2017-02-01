package ru.dmartynov.jiup.sdk.nativ.callbacks.tabs;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 01.02.17.
 */
public interface TABCLOSE_CB extends Icallback {
    /**
     *[Windows and GTK Only]: Callback called when the user clicks on the close button (since 3.10). Called only when SHOWCLOSE=Yes.
     * @param ih identifier of the element that activated the event.
     * @param pos the tab position
     * @return
     */
    int function(Ihandle ih, int pos);
}
