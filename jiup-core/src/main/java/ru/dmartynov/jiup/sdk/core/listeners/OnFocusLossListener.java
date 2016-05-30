package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.KILLFOCUS_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(KILLFOCUS_CB.class)
public interface OnFocusLossListener extends CommonListener {
    int onFocusLoss();
}
