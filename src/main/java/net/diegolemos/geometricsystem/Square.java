package net.diegolemos.geometricsystem;

public class Square implements Shape {

	private final Rectangle rectangle;

	public Square(int side) {
		this.rectangle = new Rectangle(side, side);
	}
	
	@Override
	public boolean isPixelOn(int x, int y) {
		return rectangle.isPixelOn(x, y);
	}
}
