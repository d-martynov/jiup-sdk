package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface MOTION_CB extends Icallback {
    /**
     * Action generated when the mouse moves.
     *
     * @param ih     identifier of the element that activated the event.
     * @param x      position in the canvas where the event has occurred, in pixels.
     * @param y      position in the canvas where the event has occurred, in pixels.
     * @param status status of mouse buttons and certain keyboard keys at the moment the event was generated. The same
     *               macros used for BUTTON_CB can be used for this status.
     * @return
     */
    int function(Ihandle ih, int x, int y, String status);
}
