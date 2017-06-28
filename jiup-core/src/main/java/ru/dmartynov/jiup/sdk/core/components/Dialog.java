package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.core.IupObject;
import ru.dmartynov.jiup.sdk.core.attributes.DialogSizeAttr;
import ru.dmartynov.jiup.sdk.core.attributes.PlacementAttr;
import ru.dmartynov.jiup.sdk.core.attributes.ResizeAttr;
import ru.dmartynov.jiup.sdk.core.listeners.markers.DialogListener;
import ru.dmartynov.jiup.sdk.nativ.Iup;

/**
 * Created by Дмитрий on 04.10.2015.
 */
public class Dialog extends IupObject<DialogListener> implements DialogSizeAttr, PlacementAttr, ResizeAttr {
    private int x = Iup.IUP_CENTER;
    private int y = Iup.IUP_CENTER;

    private Component child;

    public Dialog(Component child) {
        super($.IupDialog(child.getIhandle()));
        this.child = child;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Component getChild() {
        return child;
    }

}
