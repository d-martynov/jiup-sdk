package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.containers.Container;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public abstract class Control extends IupObject {
    private Container parent;

    public Control(Ihandle ihandle) {
        super(ihandle);
    }

    public void detach() {
        $.IupDetach(getIhandle());
        parent.getChilds();
    }

    public Container getParent() {
        return parent;
    }
}
