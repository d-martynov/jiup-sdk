package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.SpinListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.SPIN_CB;

/**
 * Created by dz on 01.02.17.
 */
@Native(value = SPIN_CB.class, callbackMap = @NativeMap(nativeParamIndex = 1, targetParamIndex = 0))
public interface OnSpinChangeListener extends SpinListener {

    int onSpinChange(int increment);

}
