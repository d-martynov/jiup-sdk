package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface MAP_CB {

    /**
     * Called right after an element is mapped and its attributes updated in IupMap.
     * <p/>
     * When the element is a dialog, it is called after the layout is updated. For all other elements is called before
     * the layout is updated, so the element current size will still be 0x0 during MAP_CB (since 3.14).
     *
     * @param ih identifier of the element that activated the event.
     * @return
     */
    int function(Ihandle ih);
}
