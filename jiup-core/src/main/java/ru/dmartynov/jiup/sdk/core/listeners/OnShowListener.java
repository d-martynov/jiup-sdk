package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.StateTransformer;
import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.CommonListener;
import ru.dmartynov.jiup.sdk.core.listeners.markers.DialogListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.dialog.SHOW_CB;

/**
 * Created by d.martynov on 05.10.2015.
 */
@Native(value = SHOW_CB.class, callbackMap = @NativeMap(nativeParamIndex = 1, targetParamIndex = 0,
        typeTransformer = StateTransformer.class))
public interface OnShowListener extends DialogListener {
    int onShow(State state);
    enum State {
        //TODO: Incorrect elements order
        SHOW,
        RESTORE,
        MINIMIZE,
        HIDE,
        MAXIMIZE,
    }
}
