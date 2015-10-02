package ru.dmartynov.jiup.sdk.core;

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
}
