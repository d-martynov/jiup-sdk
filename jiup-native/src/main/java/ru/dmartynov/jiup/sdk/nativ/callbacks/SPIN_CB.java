package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 01.02.17.
 */
public interface SPIN_CB extends Icallback {

    int function(Ihandle ih, int inc);

}
