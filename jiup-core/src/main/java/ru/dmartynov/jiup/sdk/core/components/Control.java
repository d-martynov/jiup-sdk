package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public abstract class Control<ListenerClass> extends Component<ListenerClass> {
    public Control(Ihandle ihandle) {
        super(ihandle);
    }
}
