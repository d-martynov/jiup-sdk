package ru.dmartynov.jiup.sdk.core.attributes;

public interface DialogSizeAttr extends SizeAttr {
    default void setSize(Size width, Size height) {
        setSize(width.name(), height.name());
    }

    default void setSize(int width, Size height) {
        setSize(width + "", height.name());
    }

    default void setSize(Size width, int height) {
        setSize(width.name(), height + "");
    }
}
