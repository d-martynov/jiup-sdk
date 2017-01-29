package ru.dmartynov.jiup.sdk.core.attributes;

/**
 * Created by Дмитрий on 28.01.2017.
 */
public class ScreenPosition {
    private int x;
    private int y;

    public ScreenPosition(String s) {
        String[] pos = s.split(",");
        this.x = Integer.parseInt(pos[0]);
        this.y = Integer.parseInt(pos[1]);
    }

    public ScreenPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
