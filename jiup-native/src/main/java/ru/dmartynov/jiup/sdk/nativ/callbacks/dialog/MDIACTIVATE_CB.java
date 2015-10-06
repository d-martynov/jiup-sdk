package ru.dmartynov.jiup.sdk.nativ.callbacks.dialog;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by d.martynov on 05.10.2015.
 */
public interface MDIACTIVATE_CB extends Icallback {
    /**
     * Called when a MDI child window is activated. Only the MDI child receive this message. It is not called when
     * the child is shown for the first time.
     *
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
