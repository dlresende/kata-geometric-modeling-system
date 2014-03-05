package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void should_draw_a_rectangle() {
        Rectangle rectangle = new Rectangle(20, 5);

        StringBuilder drawnRectangle = new StringBuilder();
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 20; x++) {
                drawnRectangle.append(rectangle.isPixelOn(x, y) ? '#' : ' ');
            }
            drawnRectangle.append('\n');
        }

        assertThat(drawnRectangle.toString()).isEqualTo("" +
                "####################\n"+
                "####################\n"+
                "####################\n"+
                "####################\n"+
                "####################\n");
    }
}
