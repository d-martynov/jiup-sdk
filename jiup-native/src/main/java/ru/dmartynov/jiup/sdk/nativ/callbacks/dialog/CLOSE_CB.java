package ru.dmartynov.jiup.sdk.nativ.callbacks.dialog;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface CLOSE_CB extends Icallback {
    /**
     * Called just before a dialog is closed when the user clicks the close button of the title bar or an equivalent
     * action.
     *
     * @param ih identifies the element that activated the event.
     * @return if IUP_IGNORE, it prevents the dialog from being closed. If you destroy the dialog in this callback, you
     * must return IUP_IGNORE. IUP_CLOSE will be processed.
     */
    int function(Ihandle ih);

}
