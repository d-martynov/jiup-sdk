package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface WOM_CB {
    /**
     * Action generated when an audio device receives an event.
     *
     * @param ih    identifies the element that activated the event.
     * @param state can be opening=1, done=0, or closing=-1.
     * @return
     */
    int function(Ihandle ih, int state);
}
