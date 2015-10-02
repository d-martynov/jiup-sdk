package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by ִלטענטי on 03.10.2015.
 */
public interface SHOW_CB extends Icallback {
    /**
     * Called right after the dialog is showed, hidden, maximized, minimized or restored from minimized/maximized.
     * This callback is called when those actions were performed by the user or programmatically by the application.
     *
     * @param ih    identifier of the element that activated the event.
     * @param state ndicates which of the following situations generated the event:
     *              <p/>
     *              IUP_HIDE (since 3.0)
     *              IUP_SHOW
     *              IUP_RESTORE (was minimized or maximized)
     *              IUP_MINIMIZE
     *              IUP_MAXIMIZE (since 3.0) (not received in Motif when activated from the maximize button)
     * @return IUP_CLOSE will be processed.
     */
    int function(Ihandle ih, int state);
}
