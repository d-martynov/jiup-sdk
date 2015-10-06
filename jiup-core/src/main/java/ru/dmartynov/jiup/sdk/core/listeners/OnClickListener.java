package ru.dmartynov.jiup.sdk.core.listeners;

import ru.dmartynov.jiup.sdk.core.annotations.Native;
import ru.dmartynov.jiup.sdk.nativ.callbacks.ACTION;

/**
 * Created by Дмитрий on 04.10.2015.
 */
@Native(value = ACTION.class)
public interface OnClickListener extends BaseListener {
    int onClick();

    interface Have {
        void setOnClickListener(OnClickListener onClickListener);
    }
}
