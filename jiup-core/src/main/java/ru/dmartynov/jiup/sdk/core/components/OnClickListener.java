package ru.dmartynov.jiup.sdk.core.components;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public interface OnClickListener {
    void onClick();

    interface Native extends Icallback {
        String NAME = "ACTION";

        int callback(Ihandle ih);
    }
}
