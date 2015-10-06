package ru.dmartynov.jiup.sdk.nativ.callbacks.dialog;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by d.martynov on 05.10.2015.
 */
public interface MOVE_CB extends Icallback {
    /**
     * Called after the dialog was moved on screen. The coordinates are the same as the SCREENPOSITION attribute.
     * @param ih identifier of the element that activated the event.
     * @param x coordinates of the new position.
     * @param y coordinates of the new position.
     * @return
     */
    int function(Ihandle ih, int x, int y);
}
