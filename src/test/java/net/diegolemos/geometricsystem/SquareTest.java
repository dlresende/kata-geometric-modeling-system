package net.diegolemos.geometricsystem;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class SquareTest {
	
	@Test
    public void should_draw_a_square() {
    	Square square = new Square(5);

        String drawnSquare = new Frame(5, 5).draw(square);

        assertThat(drawnSquare).isEqualTo("#####\n"+
					                      "#####\n"+
					                      "#####\n"+
					                      "#####\n"+
					                      "#####\n");
	}
}
