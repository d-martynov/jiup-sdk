package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface K_ANY extends Icallback {
    /**
     * Action generated when a keyboard event occurs.
     *
     * @param ih identifier of the element that activated the event.
     * @param c  identifier of typed key. Please refer to the Keyboard Codes table for a list of possible values.
     * @return If IUP_IGNORE is returned the key is ignored and not processed by the control and not propagated.
     * If returns IUP_CONTINUE, the key will be processed and the event will be propagated to the parent of the element
     * receiving it, this is the default behavior. If returns IUP_DEFAULT the key is processed but it is not propagated.
     * IUP_CLOSE will be processed.
     */
    int function(Ihandle ih, int c);
}
