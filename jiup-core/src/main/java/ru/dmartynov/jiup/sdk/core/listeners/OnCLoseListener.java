package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.CLOSE_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */

@Native(CLOSE_CB.class)
public interface OnCloseListener extends BaseListener {
    int onClose();

    interface Have {
        void setOnCloseListener(OnCloseListener onCloseListener);
    }
}
