package ru.dmartynov.jiup.sdk.core.components;


import ru.dmartynov.jiup.sdk.nativ.Ihandle;
import ru.dmartynov.jiup.sdk.nativ.Iup;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Button extends Widget {
    public Button(String title) {
        super($.IupButton(title, null));
    }

    public void setOnClickListener(final OnClickListener onClickListener) {
        $.IupSetCallback(getIhandle(), OnClickListener.Native.NAME, new OnClickListener.Native() {
            public int callback(Ihandle ih) {
                onClickListener.onClick();
                return Iup.IUP_CLOSE;
            }
        });
    }
}
