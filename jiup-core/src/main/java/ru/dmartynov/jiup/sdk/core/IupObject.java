package ru.dmartynov.jiup.sdk.core;

import ru.dmartynov.jiup.sdk.core.components.Size;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;
import ru.dmartynov.jiup.sdk.nativ.Iup;

/**
 * Created by Дмитрий on 02.10.2015.
 */

public abstract class IupObject {
    public static Iup $ = Iup.INST;

    private Ihandle ihandle;

    public IupObject(Ihandle ihandle) {
        this.ihandle = ihandle;
    }

    public Ihandle getIhandle() {
        return ihandle;
    }


    public void setSize(Size width, Size height) {
        setSize(width.name(), height.name());
    }

    public void setSize(int width, int height) {
        setSize(width + "", height + "");
    }

    public void setSize(int width, Size height) {
        setSize(width + "", height.name());
    }

    public void setSize(Size width, int height) {
        setSize(width.name(), height + "");
    }

    public int getHeight() {
       return Integer.valueOf($.IupGetAttribute(getIhandle(), "SIZE").split("x")[1]);
    }

    public int getWidth() {
        return Integer.valueOf($.IupGetAttribute(getIhandle(), "SIZE").split("x")[0]);
    }

    private void setSize(String width, String height) {
        $.IupSetAttribute(ihandle, "SIZE", width + "x" + height);
    }
}
