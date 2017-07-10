package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ListListener;
import ru.dmartynov.jiup.sdk.nativ.callbacks.VALUECHANGED_CB;

@Native(value = VALUECHANGED_CB.class)
public interface OnValueChangedListener extends ListListener {
    void onValueChanged();
}
