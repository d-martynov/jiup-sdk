package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ButtonListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.BUTTON_CB;

/**
 * Created by dmartynov on 14.06.16.
 */
@Native(value = BUTTON_CB.class, callbackMap = {
        @NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1),
        @NativeMap(nativeParamIndex = 3, targetParamIndex = 2),
        @NativeMap(nativeParamIndex = 4, targetParamIndex = 3),
        @NativeMap(nativeParamIndex = 5, targetParamIndex = 4)})
public interface OnMouseEventListener extends ButtonListener {
    int OnMouseEvent(int button, int pressed, int x, int y, String status);
}
