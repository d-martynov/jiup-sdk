package ru.dmartynov.jiup.sdk.core.components.controls;


import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.OnClickListener;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Button extends Control {
    private OnClickListener onClickListener;

    public Button(String title) {
        super($.IupButton(title, null));
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
