package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.LEAVEWINDOW_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */

@Native(LEAVEWINDOW_CB.class)
public interface OnMouseLeaveListener extends BaseListener {
    int onMouseLeave();

    interface Have {
        void setOnMouseLeaveListener(OnMouseLeaveListener onMouseLeaveListener);
    }
}
