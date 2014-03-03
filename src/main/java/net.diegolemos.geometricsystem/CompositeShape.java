package net.diegolemos.geometricsystem;

import java.util.LinkedList;
import java.util.List;

public class CompositeShape extends Shape {
    private List<Shape> components = new LinkedList<>();

    void add(Shape shape) {
        components.add(shape);
    }

    String draw() {
        String output = "";

        for (Shape next : components) {
            if (next instanceof Circle) {
                output += ((Circle) next).draw();
            }

            else if (next instanceof Rectangle) {
                output += ((Rectangle) next).draw();
            }

            else if (next instanceof CompositeShape) {
                output += ((CompositeShape) next).draw();
            }

            else {
                throw new RuntimeException("unrecognized shape");
            }
        }

        return output;
    }
}
