package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.GETFOCUS_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */

@Native(GETFOCUS_CB.class)
public interface OnFocusGetListener extends BaseListener {
    int onFocusGet();

    interface Have {
        void setOnGetFocusListener(OnFocusGetListener onFocusGetListener);
    }
}
