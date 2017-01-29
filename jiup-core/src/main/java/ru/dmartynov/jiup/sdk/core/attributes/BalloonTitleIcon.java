package ru.dmartynov.jiup.sdk.core.attributes;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public enum BalloonTitleIcon {
    NO(0),
    INFO(1),
    WARNING(2),
    ERROR(3);

    private final int code;

    BalloonTitleIcon(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
