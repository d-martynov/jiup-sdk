package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.core.listeners.markers.DialogListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.COPYDATA_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(COPYDATA_CB.class)
public interface OnNextInstanceRunningListener extends DialogListener {
    int onNextInstanceRunning();
}
