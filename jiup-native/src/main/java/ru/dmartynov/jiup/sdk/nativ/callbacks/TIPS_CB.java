package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface TIPS_CB extends Icallback {
    /**
     * Action before a tip is displayed.
     *
     * @param ih identifier of the element that activated the event.
     * @param x  cursor position relative to the top corner of the element
     * @param y  cursor position relative to the left corner of the element
     * @return
     */
    int function(Ihandle ih, int x, int y);
}
