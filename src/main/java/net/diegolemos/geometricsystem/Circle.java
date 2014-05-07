package net.diegolemos.geometricsystem;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public boolean isPixelActivated(int x, int y) {
        int relativeX = x - radius;
        int relativeY = y - radius;
        return (relativeX * relativeX + relativeY * relativeY < radius * radius);
    }
}
