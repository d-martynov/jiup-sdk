package ru.dmartynov.jiup.sdk.core.components.containers;

import ru.dmartynov.jiup.sdk.core.components.Component;
import ru.dmartynov.jiup.sdk.core.listeners.markers.FrameListener;

public class Frame extends Component<FrameListener> {
    public Frame(Component child) {
        super($.IupFrame(child.getIhandle()));
    }
}
