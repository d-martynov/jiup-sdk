package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.core.listeners.markers.DialogListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.MOVE_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(value = MOVE_CB.class, callbackMap = {@NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1)})
public interface OnMoveListener extends DialogListener {
    int onMove(int x, int y);
}
