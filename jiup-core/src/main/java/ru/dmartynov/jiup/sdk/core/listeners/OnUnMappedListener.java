package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.UNMAP_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(UNMAP_CB.class)
public interface OnUnmappedListener extends BaseListener {
    int onUnMapped();

    interface Have {
        void setOnUnmappedListener(OnUnmappedListener onUnmappedListener);
    }
}
