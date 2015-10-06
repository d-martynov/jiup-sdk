package ru.dmartynov.jiup.sdk.nativ.callbacks.dialog;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by d.martynov on 05.10.2015.
 */
public interface COPYDATA_CB extends Icallback {
    /**
     * Called at the first instance, when a second instance is running. Must set the global attribute SINGLEINSTANCE to
     * be called. (since 3.2).
     *
     * @param ih      identifier of the element that activated the event.
     * @param cmdLine command line of the second instance.
     * @param size    size of the command line string including the null character.
     * @return
     */
    int function(Ihandle ih, String cmdLine, int size);

}
