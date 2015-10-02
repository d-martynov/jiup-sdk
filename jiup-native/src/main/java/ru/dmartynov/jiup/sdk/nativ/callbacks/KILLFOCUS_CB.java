package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface KILLFOCUS_CB extends Icallback {
    /**
     * Action generated when an element loses keyboard focus. This callback is called before the GETFOCUS_CB of the
     * element that gets the focus.
     *
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
