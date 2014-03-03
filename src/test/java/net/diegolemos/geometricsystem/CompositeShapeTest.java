package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CompositeShapeTest {

    @Test
    public void should_draw_composite_shape() throws Exception {
        CompositeShape allShapes = new CompositeShape();
        allShapes.add(new Circle(5));
        allShapes.add(new Rectangle(10, 2));

        String output = allShapes.draw();

        assertThat(output).isEqualTo("          \n" +
                "   #####  \n" +
                "  ####### \n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                " #########\n" +
                "  ####### \n" +
                "   #####  \n" +
                "##########\n" +
                "##########\n");
    }

}
