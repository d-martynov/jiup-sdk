package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface ENTERWINDOW_CB extends Icallback {
    /**
     * Action generated when the mouse enters the native element.
     *
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
