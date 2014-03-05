package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CircleTest {

    @Test
    public void should_draw_circle() {
        final Circle circle = new Circle(5);

        String drawnCircle = new Frame(10, 10).draw((x, y) -> circle.isPixelOn(x, y));

        assertThat(drawnCircle).isEqualTo("          \n" +
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
