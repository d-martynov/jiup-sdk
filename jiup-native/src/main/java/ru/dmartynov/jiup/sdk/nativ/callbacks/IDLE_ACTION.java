package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;

/**
 * Created by ִלטענטי on 03.10.2015.
 */

public interface IDLE_ACTION extends Icallback {
    /**
     * Predefined IUP action, generated when there are no events or messages to be processed. Often used to perform
     * background operations.
     *
     * @return if IUP_CLOSE is returned the current loop will be closed and the callback will be removed. If IUP_IGNORE
     * is returned the callback is removed and normal processing continues.
     */
    int function();
}
