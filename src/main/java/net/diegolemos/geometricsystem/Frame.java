package net.diegolemos.geometricsystem;

public class Frame {
    private final int width;
    private final int height;

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String draw(CharSupplier charSupplier) {
        StringBuilder output = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                output.append(charSupplier.getAsChar(x, y));
            }
            output.append('\n');
        }
        return output.toString();
    }
}
