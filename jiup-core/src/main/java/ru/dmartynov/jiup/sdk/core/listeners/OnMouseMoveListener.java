package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.LabelListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.MOTION_CB;

/**
 * Created by Дмитрий on 28.01.2017.
 */
@Native(value = MOTION_CB.class, callbackMap = {
        @NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1),
        @NativeMap(nativeParamIndex = 3, targetParamIndex = 2)
})
public interface OnMouseMoveListener extends LabelListener {
    int onMouseMove(int x, int y, String status);
}
