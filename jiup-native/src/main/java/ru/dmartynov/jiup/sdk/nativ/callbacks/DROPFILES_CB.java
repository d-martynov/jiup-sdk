package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface DROPFILES_CB extends Icallback {
    /**
     * Action called when a file is "dropped" into the control. When several files are dropped at once, the callback is
     * called several times, once for each file.
     * If defined after the element is mapped then the attribute DROPFILESTARGET must be set to YES.
     *
     * @param ih       identifier of the element that activated the event.
     * @param filename Name of the dropped file.
     * @param num      Number index of the dropped file. If several files are dropped, num is the index of the dropped file
     *                 starting from "total-1" to "0".
     * @param x        X coordinate of the point where the user released the mouse button.
     * @param y        Y coordinate of the point where the user released the mouse button.
     * @return If IUP_IGNORE is returned the callback will NOT be called for the next dropped files, and the processing
     * of dropped files will be interrupted.
     */
    int function(Ihandle ih, final String filename, int num, int x, int y);
}
