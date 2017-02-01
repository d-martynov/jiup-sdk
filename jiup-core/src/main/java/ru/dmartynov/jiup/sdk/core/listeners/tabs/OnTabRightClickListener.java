package ru.dmartynov.jiup.sdk.core.listeners.tabs;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.tabs.RIGHTCLICK_CB;

/**
 * Created by dz on 01.02.17.
 */
@Native(value = RIGHTCLICK_CB.class, callbackMap = @NativeMap(nativeParamIndex = 1, targetParamIndex = 0))
public interface OnTabRightClickListener extends CommonListener{
    int onClick(int position);
}
