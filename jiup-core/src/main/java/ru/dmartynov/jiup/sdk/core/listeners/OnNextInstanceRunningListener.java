package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.COPYDATA_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(COPYDATA_CB.class)
public interface OnNextInstanceRunningListener extends BaseListener {
    int onNextInstanceRunning();

    interface Have {
        void setOnNextInstanceRunningListener(OnNextInstanceRunningListener onNextInstanceRunningListener);
    }

}
