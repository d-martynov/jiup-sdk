package ru.dmartynov.jiup.sdk.core.attributes;

import ru.dmartynov.jiup.sdk.core.IupObject;

/**
 * Created by dmartynov on 27.01.17.
 */
public interface ActiveAttr {
    default void setActive(boolean active) {
        IupObject self = (IupObject) this;
        IupObject.$.IupSetAttribute(self.getIhandle(), "ACTIVE", active ? "YES" : "NO");
    }
}
