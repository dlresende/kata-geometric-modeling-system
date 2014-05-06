package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CompositeShapeTest {

    @Test
    public void should_draw_composite_shape() throws Exception {
        CompositeShape allShapes = new CompositeShape();
        allShapes.add(new Circle(5));
        allShapes.add(0, 10, new Rectangle(10, 2));

        String output = new Frame(10, 12).draw((x, y) -> allShapes.getAsChar(x, y));

        assertThat(output).isEqualTo("          \n" +
                                     "   @@@@@  \n" +
                                     "  @@@@@@@ \n" +
                                     " @@@@@@@@@\n" +
                                     " @@@@@@@@@\n" +
                                     " @@@@@@@@@\n" +
                                     " @@@@@@@@@\n" +
                                     " @@@@@@@@@\n" +
                                     "  @@@@@@@ \n" +
                                     "   @@@@@  \n" +
                                     "##########\n" +
                                     "##########\n");
    }

    @Test
    public void should_draw_a_car_shape() throws Exception {
        CompositeShape allShapes = new CompositeShape();
        allShapes.add(7, 0, new Rectangle(15, 6));
        allShapes.add(0, 6, new Rectangle(30, 6));
        allShapes.add(2, 6, new Circle(5));
        allShapes.add(18, 6, new Circle(5));

        String output = new Frame(30, 16).draw((x, y) -> allShapes.getAsChar(x, y));

        assertThat(output).isEqualTo("" +
                "       ###############        \n" +
                "       ###############        \n" +
                "       ###############        \n" +
                "       ###############        \n" +
                "       ###############        \n" +
                "       ###############        \n" +
                "##############################\n" +
                "##############################\n" +
                "##############################\n" +
                "##############################\n" +
                "##############################\n" +
                "##############################\n" +
                "   @@@@@@@@@       @@@@@@@@@  \n" +
                "   @@@@@@@@@       @@@@@@@@@  \n" +
                "    @@@@@@@         @@@@@@@   \n" +
                "     @@@@@           @@@@@    \n");
    }

}
