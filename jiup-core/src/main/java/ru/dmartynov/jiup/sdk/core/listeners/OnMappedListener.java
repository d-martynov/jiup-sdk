package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.MAP_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */

@Native(MAP_CB.class)
public interface OnMappedListener extends BaseListener {
    int onMapped();

    interface Have {
        void setOnMappedListener(OnMappedListener onMappedListener);
    }
}