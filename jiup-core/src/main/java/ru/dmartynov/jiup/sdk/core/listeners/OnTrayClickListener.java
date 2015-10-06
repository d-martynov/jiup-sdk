package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.TRAYCLICK_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(value = TRAYCLICK_CB.class, callbackMap = {
        @NativeMap(nativeParamIndex = 1, targetParamIndex = 0),
        @NativeMap(nativeParamIndex = 2, targetParamIndex = 1),
        @NativeMap(nativeParamIndex = 3, targetParamIndex = 2)
})
public interface OnTrayClickListener extends BaseListener {
    int onTrayClick(int but, int pressed, int doubleClick);

    interface Have {
        void setOnTrayClickListener(OnTrayClickListener onTrayClickListener);
    }
}
