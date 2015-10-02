package ru.dmartynov.jiup.sdk.nativ.callbacks;

import ru.dmartynov.jiup.sdk.nativ.Icallback;
import ru.dmartynov.jiup.sdk.nativ.Ihandle;

/**
 * Created by Дмитрий on 03.10.2015.
 */
public interface SCROLL_CB extends Icallback {
    /**
     * Called when some manipulation is made to the scrollbar. The canvas is automatically redrawn only if this callback is NOT defined.
     * <p/>
     * (GTK 2.8) Also the POSX and POSY values will not be correctly updated for older GTK versions.
     * <p/>
     * In Ubuntu, when liboverlay-scrollbar is enabled (the new tiny auto-hide scrollbar) only the IUP_SBPOSV and IUP_SBPOSH codes are used.
     *
     * @param ih   identifier of the element that activated the event.
     * @param op   indicates the operation performed on the scrollbar.
     *             <p/>
     *             If the manipulation was made on the vertical scrollbar, it can have the following values:
     *             <p/>
     *             IUP_SBUP - line up
     *             IUP_SBDN - line down
     *             IUP_SBPGUP - page up
     *             IUP_SBPGDN - page down
     *             IUP_SBPOSV - vertical positioning
     *             IUP_SBDRAGV - vertical drag
     *             <p/>
     *             If it was on the horizontal scrollbar, the following values are valid:
     *             <p/>
     *             IUP_SBLEFT - column left
     *             IUP_SBRIGHT - column right
     *             IUP_SBPGLEFT - page left
     *             IUP_SBPGRIGHT - page right
     *             IUP_SBPOSH - horizontal positioning
     *             IUP_SBDRAGH - horizontal drag
     * @param posx the same as the ACTION canvas callback (corresponding to the values of attributes POSX and POSY).
     * @param posy the same as the ACTION canvas callback (corresponding to the values of attributes POSX and POSY).
     * @return
     */
    int function(Ihandle ih, int op, float posx, float posy);
}
