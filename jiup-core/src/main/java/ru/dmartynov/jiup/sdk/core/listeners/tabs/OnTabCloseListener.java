package ru.dmartynov.jiup.sdk.core.listeners.tabs;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.annotations.NativeMap;
import ru.dmartynov.jiup.sdk.core.listeners.markers.TabsListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.tabs.TABCLOSE_CB;

/**
 * Created by dz on 01.02.17.
 */

@Native(value = TABCLOSE_CB.class, callbackMap = @NativeMap(nativeParamIndex = 1,targetParamIndex = 0))
public interface OnTabCloseListener extends TabsListener{
    /**
     * the tab will be hidden if the callback returns IUP_DEFAULT or if it does not exists.
     * If IUP_CONTINUE is returned the tab is removed and its children are destroyed.
     * If IUP_IGNORE is returned does nothing.
     * @param pos
     * @return
     */
    int onClose(int pos);
}
