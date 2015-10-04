package ru.dmartynov.jiup.sdk.nativ;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Ihandle extends Structure {

    public Pointer ihandle;

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("ihandle");
    }
}
