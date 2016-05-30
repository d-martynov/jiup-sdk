package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */

public interface BUTTON_CB extends Icallback {
    /**
     * Action generated when a mouse button is pressed or released.
     *
     * @param ih      identifies the element that activated the event.
     * @param button  identifies the activated mouse button:
     *                IUP_BUTTON1 - left mouse button (button 1);
     *                IUP_BUTTON2 - middle mouse button (button 2);
     *                IUP_BUTTON3 - right mouse button (button 3).
     * @param pressed indicates the state of the button:
     *                0 - mouse button was released;
     *                1 - mouse button was pressed.
     * @param x       position in the canvas where the event has occurred, in pixels.
     * @param y       position in the canvas where the event has occurred, in pixels.
     * @param status  status of the mouse buttons and some keyboard keys at the moment the event is generated
     * @return IUP_CLOSE will be processed. On some controls if IUP_IGNORE is returned the action is ignored (this is system dependent).
     */
    int function(Ihandle ih, int button, int pressed, int x, int y, String status);
}
