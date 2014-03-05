package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CircleTest {

    @Test
    public void should_draw_circle() {
        Circle circle = new Circle(5);

        StringBuilder drawnCircle = new StringBuilder();
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                drawnCircle.append(circle.isPixelOn(x, y) ? '#' : ' ');
            }
            drawnCircle.append('\n');
        }

        assertThat(drawnCircle.toString()).isEqualTo("          \n" +
                "   #####  \n" +
                "  ####### \n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                "  ####### \n" +
                "   #####  \n");
    }
}
