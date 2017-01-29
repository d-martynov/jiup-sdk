package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.TIPS_CB;

/**
 * Created by Дмитрий on 28.01.2017.
 */
@Native(value = TIPS_CB.class, callbackMap = {
        @NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1)
})
public interface OnTipShownListener extends CommonListener {
    int onTipShown(int x, int y);
}
