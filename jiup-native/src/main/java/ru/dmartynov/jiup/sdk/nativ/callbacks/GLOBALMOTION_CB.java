package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;

/**
 * Created by dmartynov on 17.06.16.
 */
public interface GLOBALMOTION_CB extends Icallback {
    int function(int x, int y, String status);
}
