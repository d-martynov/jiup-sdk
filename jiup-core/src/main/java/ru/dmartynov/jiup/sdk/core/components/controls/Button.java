package ru.dmartynov.jiup.sdk.core.components.controls;


import ru.dmartynov.jiup.sdk.core.attributes.*;
import ru.dmartynov.jiup.sdk.core.components.Control;
import ru.dmartynov.jiup.sdk.core.listeners.markers.ButtonListener;

/**
 * Created by Дмитрий on 02.10.2015.
 */
public class Button extends Control<ButtonListener> implements CommonAttrs, AlignmentAttr, BgColorAttr, CanFocusAttr,
        FlatAttr, FgColorAttr, ImPressBorderAttr, ImagePositionAttr, MarkupAttr, PaddingAttr, SpacingAttr, TitleAttr,
        ImageAttr, ImInactiveAttr, ImPressAttr {

    public Button(String title) {
        super($.IupButton(title, null));
    }

    public Button() {
        super($.IupButton(null, null));
    }
}
