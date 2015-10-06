package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.DESTROY_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(DESTROY_CB.class)
public interface OnDestroyListener extends BaseListener {
    int onDestroy();

    interface Have {
        void setOnDestroyListener(OnDestroyListener onDestroyListener);
    }
}
