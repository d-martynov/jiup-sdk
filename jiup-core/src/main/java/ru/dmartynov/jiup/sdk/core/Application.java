package ru.dmartynov.jiup.sdk.core;

import ru.dmartynov.jiup.sdk.core.components.Dialog;
import ru.dmartynov.jiup.sdk.nativ.Iup;

/**
 * Created by Дмитрий on 04.10.2015.
 */
public abstract class Application {
    public void start(String[] args) {
        Iup $ = Iup.INST;
        $.IupOpen(0, null);

        Dialog mainDialog = getMainDialog();
        $.IupShowXY(mainDialog.getIhandle(), mainDialog.getX(), mainDialog.getY());
        $.IupMainLoop();
        $.IupClose();
        System.exit(0);
    }

    protected abstract Dialog getMainDialog();

}
