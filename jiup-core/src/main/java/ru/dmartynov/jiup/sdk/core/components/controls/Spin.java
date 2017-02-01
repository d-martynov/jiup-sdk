package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.SpinListener;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 01.02.17.
 */
public class Spin extends Control<SpinListener> {

    public Spin() {
        super($.IupSpin());
    }
}
