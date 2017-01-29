package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

import static ru.dmartynov.jiup.sdk.core.IupObject.$;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public interface ScreenPositionAttr {
    default ScreenPosition getScreenPosition() {
        return new ScreenPosition($.IupGetAttribute(((IupObject) this).getIhandle(), "SCREENPOSITION"));
    }
}
