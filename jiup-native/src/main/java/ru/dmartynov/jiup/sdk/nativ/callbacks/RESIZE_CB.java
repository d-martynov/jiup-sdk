package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface RESIZE_CB extends Icallback {
    /**
     * Action generated when the canvas or dialog size is changed.
     *
     * @param ih     identifier of the element that activated the event.
     * @param width  the width of the internal element size in pixels not considering the decorations (client size)
     * @param height the height of the internal element size in pixels not considering the decorations (client size)
     * @return
     */
    int function(Ihandle ih, int width, int height);
}
