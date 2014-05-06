package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void should_draw_a_rectangle() {
        Rectangle rectangle = new Rectangle(20, 5);

        String drawnRectangle = new Frame(20, 5).draw(rectangle);

        assertThat(drawnRectangle).isEqualTo("####################\n"+
                                             "####################\n"+
                                             "####################\n"+
                                             "####################\n"+
                                             "####################\n");
    }
}
