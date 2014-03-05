package net.diegolemos.geometricsystem;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    boolean isPixelOn(int x, int y) {
        return 0 <= x && x < width && 0 <= y && y < height;
    }
}
