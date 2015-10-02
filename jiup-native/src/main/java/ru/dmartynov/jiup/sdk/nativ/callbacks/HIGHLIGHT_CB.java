package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface HIGHLIGHT_CB extends Icallback {
    /**
     * Callback triggered every time the user selects an IupItem or IupSubmenu.
     *
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
