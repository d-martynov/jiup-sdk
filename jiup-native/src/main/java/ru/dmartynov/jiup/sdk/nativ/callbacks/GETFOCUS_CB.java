package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface GETFOCUS_CB extends Icallback {
    /**
     * Action generated when an element is given keyboard focus. This callback is called after the KILLFOCUS_CB of the
     * element that loosed the focus. The IupGetFocus function during the callback returns the element that loosed the
     * focus.
     *
     * @param ih ih: identifier of the element that received keyboard focus.
     * @return
     */
    int function(Ihandle ih);
}
