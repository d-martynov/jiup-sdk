package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface TipAttr {
    default void setTip(String tip) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIP", tip);
    }

    default void setTipBalloon(boolean tipBalloon) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPBALLOON", tipBalloon ? "YES" : "NO");
    }

    default void setTipBalloonTitle(String tipBalloonTitle) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPBALLOONTITLE", tipBalloonTitle);
    }

    default void setTipBalloonTitleIcon(BalloonTitleIcon icon) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPBALLOONTITLEICON", icon.getCode() + "");
    }

    default void setTipBgColor(Color color) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPBGCOLOR", color.getR() + " " + color.getB() + " " + color.getB());
    }

    default void setTipDelay(int delay) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPDELAY", delay + "");

    }

    default void setTipFgColor(Color color) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPFGCOLOR", color.getR() + " " + color.getB() + " " + color.getB());
    }

    default void setTipFont() {
        //TODO
    }

    default void setTipIcon() {
        //TODO
    }

    default void setTipMarkup(boolean markup) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPMARKUP", markup ? "YES" : "NO");
    }

    default void setTipRect(int x1, int y1, int x2, int y2) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPRECT", x1 + " " + y1 + " " + x2 + " " + y2);

    }

    default void setTipVisible(boolean visible) {
        $.IupSetAttribute(((IupObject) this).getIhandle(), "TIPVISIBLE", visible ? "YES" : "NO");

    }
}
