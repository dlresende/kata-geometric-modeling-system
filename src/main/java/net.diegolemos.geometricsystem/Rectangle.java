package net.diegolemos.geometricsystem;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    String draw() {
        StringBuilder output = new StringBuilder();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                output.append(('#'));
            }
            output.append('\n');
        }

        return output.toString();
    }
}
