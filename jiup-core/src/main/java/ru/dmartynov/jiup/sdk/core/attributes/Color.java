package ru.dmartynov.jiup.sdk.core.attributes;

/**
 * Created by dmartynov on 27.01.17.
 */
public class Color {
    private int r, g, b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
