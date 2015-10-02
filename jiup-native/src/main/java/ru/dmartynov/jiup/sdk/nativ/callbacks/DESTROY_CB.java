package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface DESTROY_CB extends Icallback {
    /**
     * Called right before an element is destroyed.
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
