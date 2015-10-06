package ru.dmartynov.jiup.sdk.nativ.callbacks.dialog;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by d.martynov on 05.10.2015.
 */
public interface TRAYCLICK_CB extends Icallback {
    /**
     * Called right after the mouse button is pressed or released over the tray icon.
     * @param ih  identifier of the element that activated the event.
     * @param but identifies the activated mouse button. Can be: 1, 2 or 3. Note that this is different from the
     *            BUTTON_CB canvas callback definition. GTK does not get button=2 messages.
     * @param pressed indicates the state of the button. Always 1 in GTK.
     * @param dclick indicates a double click. In GTK double click is simulated.
     * @return IUP_CLOSE will be processed.
     */
    int function(Ihandle ih, int but, int pressed, int dclick);
}
