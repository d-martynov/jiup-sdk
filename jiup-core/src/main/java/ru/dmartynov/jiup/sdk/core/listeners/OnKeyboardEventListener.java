package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.K_ANY;

/**
 * Created by d.martynov on 05.10.2015.
 */

@Native(value = K_ANY.class, callbackMap = @NativeMap(nativeParamIndex = 1, targetParamIndex = 0))
public interface OnKeyboardEventListener extends CommonListener {
    int onKeyboardEvent(int keyIdentifier);
}
