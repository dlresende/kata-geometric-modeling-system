package net.diegolemos.geometricsystem;

public class Frame {
    private final int width;
    private final int height;

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String draw(Shape shape) {
        StringBuilder output = new StringBuilder();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                char pixel = ' ';
                if (shape instanceof Circle) {
                    if (((Circle) shape).isPixelActivated(x, y)) pixel = '#';
                }

                if (shape instanceof Rectangle) {
                    if (((Rectangle) shape).isPixelOn(x, y)) pixel = '#';
                }

                if (shape instanceof CompositeShape) {
                    if (((CompositeShape) shape).shouldTurnOn(x, y)) pixel = '#';
                }
                output.append(pixel);
            }
            output.append('\n');
        }

        return output.toString();
    }
}
