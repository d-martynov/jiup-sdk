package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.attributes.ProgressBarAttrs;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by dz on 03.02.17.
 */
public class ProgressBar extends Control implements ProgressBarAttrs{

    public ProgressBar() {
        super($.IupProgressBar());
    }
}
