package ru.dmartynov.jiup.sdk.core.attributes;

/**
 * Created by dz on 01.02.17.
 */
public enum Orientation {

    HORIZONTAL("HORIZONTAL"),
    VERTICAL("VERTICAL");

    private final String systemName;

    Orientation(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemName() {
        return systemName;
    }
}
