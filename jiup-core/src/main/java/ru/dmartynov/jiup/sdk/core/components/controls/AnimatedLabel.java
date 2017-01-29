package ru.dmartynov.jiup.sdk.core.components.controls;

import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.AnimatedLabelListener;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public class AnimatedLabel extends Control<AnimatedLabelListener> {
    public AnimatedLabel() {
        super($.IupAnimatedLabel());
    }
}
