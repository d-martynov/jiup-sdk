package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface WHEEL_CB extends Icallback {
    /**
     * Action generated when the mouse wheel is rotated. If this callback is not defined the wheel will automatically
     * scroll the canvas in the vertical direction by some lines, the SCROLL_CB callback if defined will be called with
     * the IUP_SBDRAGV operation.
     *
     * @param ih     identifier of the element that activated the event.
     * @param delta  the amount the wheel was rotated in notches.
     * @param x      position in the canvas where the event has occurred, in pixels.
     * @param y      position in the canvas where the event has occurred, in pixels.
     * @param status status of mouse buttons and certain keyboard keys at the moment the event was generated. The
     *               same macros used for BUTTON_CB can be used for this status.
     * @return
     */
    int function(Ihandle ih, float delta, int x, int y, String status);
}
