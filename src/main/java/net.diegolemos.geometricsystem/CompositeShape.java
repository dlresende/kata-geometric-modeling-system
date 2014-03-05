package net.diegolemos.geometricsystem;

import java.util.LinkedList;
import java.util.List;

public class CompositeShape extends Shape {
    private List<ShapeWithRelativeCoords> components = new LinkedList<>();

    void add(Shape shape) {
        components.add(new ShapeWithRelativeCoords(shape));
    }

    void add(int topX, int topY, Shape shape) {
        components.add(new ShapeWithRelativeCoords(topX, topY, shape));
    }

    boolean isPixelOn(int x, int y) {
        for (ShapeWithRelativeCoords component : components) {
            int relativeX = x - component.topX;
            int relativeY = y - component.topY;
            if (component.shape instanceof Circle) {
                if (((Circle) component.shape).isPixelOn(relativeX, relativeY)) {
                    return true;
                }
            }
            if (component.shape instanceof Rectangle) {
                if (((Rectangle) component.shape).isPixelOn(relativeX, relativeY)) {
                    return true;
                }
            }
            if (component.shape instanceof CompositeShape) {
                if (((CompositeShape) component.shape).isPixelOn(relativeX, relativeY)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final class ShapeWithRelativeCoords {
        private final int topX;
        private final int topY;
        private final Shape shape;

        private ShapeWithRelativeCoords(Shape shape) {
            this.topX = 0;
            this.topY = 0;
            this.shape = shape;
        }

        private ShapeWithRelativeCoords(int topX, int topY, Shape shape) {
            this.topX = topX;
            this.topY = topY;
            this.shape = shape;
        }
    }
}
