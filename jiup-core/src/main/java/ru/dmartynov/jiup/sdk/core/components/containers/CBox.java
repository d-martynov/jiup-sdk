package ru.dmartynov.jiup.sdk.core.components.containers;

/**
 * Created by dmartynov on 14.06.16.
 */
public class CBox extends Container {
    private int x, y;

    public CBox() {
        super($.IupCbox());
    }

    public void setX(int x) {
        $.IupSetAttribute(getIhandle(), "CX", x + "");
        this.x = x;
    }

    public void setY(int y) {
        $.IupSetAttribute(getIhandle(), "CY", y + "");
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
