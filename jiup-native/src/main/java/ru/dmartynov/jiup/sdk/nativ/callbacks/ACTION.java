package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public interface ACTION extends Icallback {
    /**
     * Action generated when the element is activated. Affects each element differently.
     * @param ih  identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
