package net.diegolemos.geometricsystem;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    String draw() {
        StringBuffer circle = new StringBuffer();

        for(int x = -radius; x < radius; x++) {
            for(int y = -radius; y < radius; y++) {
                if(isInside(x, y)) {
                    circle.append("#");
                }

                else {
                    circle.append(" ");
                }
            }

            circle.append("\n");
        }

        return circle.toString();
    }

    private boolean isInside(int x, int y) {
        return x * x + y * y < radius * radius;
    }
}
