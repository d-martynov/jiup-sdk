package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.nativ.callbacks.DROPFILES_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(value = DROPFILES_CB.class, callbackMap = {
        @NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1),
        @NativeMap(nativeParamIndex = 3, targetParamIndex = 2),
        @NativeMap(nativeParamIndex = 4, targetParamIndex = 3)
})
public interface OnFileDroppedListener extends BaseListener {
    int onFileDropped(String fileName, int num, int x, int y);

    interface Have {
        void setOnFileDroppedListener(OnFileDroppedListener onFileDropped);
    }
}
