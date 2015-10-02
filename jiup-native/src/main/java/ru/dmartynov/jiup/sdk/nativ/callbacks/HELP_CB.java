package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface HELP_CB extends Icallback {
    /**
     * Action generated when the user press F1 at a control. In Motif is also activated by the Help button in some
     * workstations keyboard.
     *
     * @param ih identifier of the element that activated the event.
     */
    void function(Ihandle ih);
}
