package ru.dmartynov.jiup.sdk.nativ;

import com.sun.jna.Pointer;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Ihandle extends Pointer {
    public Ihandle(long peer) {
        super(peer);
    }
}
