package factory.abstractfactory;

public class TextCircle extends AbstractCircle {

	public TextCircle(int x, int y, int radius) {
		super(x, y, radius);
	}

	@Override
	public void draw() {
		System.out.println("Circle(" + getX() + "," + getY() + "," + getRadius() + ")");
	}
}
