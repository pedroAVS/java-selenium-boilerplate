package io.mb.oneweb.java.selenium.framework._infra;

public enum ViewPort {

    DESKTOP(1400, 850),
    PHONE(375, 812),
    TABLET(768, 1024);

    private int width;

    private int height;

    ViewPort(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
