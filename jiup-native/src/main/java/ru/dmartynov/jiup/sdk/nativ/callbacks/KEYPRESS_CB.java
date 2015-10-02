package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface KEYPRESS_CB extends Icallback {
    /**
     * Action generated when a key is pressed or released. If the key is pressed and held several calls will occur.
     * It is called after the callback K_ANY is processed.
     *
     * @param ih    identifier of the element that activated the event.
     * @param c     identifier of typed key. Please refer to the Keyboard Codes table for a list of possible values.
     * @param press 1 is the user pressed the key or 0 otherwise.
     * @return If IUP_IGNORE is returned the key is ignored by the system. IUP_CLOSE will be processed.
     */
    int function(Ihandle ih, int c, int press);
}
