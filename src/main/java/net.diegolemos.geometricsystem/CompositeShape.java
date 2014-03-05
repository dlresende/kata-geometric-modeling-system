package net.diegolemos.geometricsystem;

import java.util.LinkedList;
import java.util.List;

public class CompositeShape extends Shape {
    private List<ShapeAndTop> components = new LinkedList<>();

    void add(Shape shape) {
        components.add(new ShapeAndTop(shape));
    }

    void add(int topX, int topY, Shape shape) {
        components.add(new ShapeAndTop(topX, topY, shape));
    }

    boolean isPixelOn(int x, int y) {
        for (ShapeAndTop component : components) {
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

    private static final class ShapeAndTop {
        private final int topX;
        private final int topY;
        private final Shape shape;

        private ShapeAndTop(Shape shape) {
            this.topX = 0;
            this.topY = 0;
            this.shape = shape;
        }

        private ShapeAndTop(int topX, int topY, Shape shape) {
            this.topX = topX;
            this.topY = topY;
            this.shape = shape;
        }
    }
}
