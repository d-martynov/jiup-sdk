package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public abstract class Component<ListenerClass> extends IupObject<ListenerClass> {
    private Component parent;

    public Component(Ihandle ihandle) {
        super(ihandle);
    }

}
