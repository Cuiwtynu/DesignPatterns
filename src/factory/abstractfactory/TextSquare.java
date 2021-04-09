package factory.abstractfactory;

public class TextSquare extends AbstractSquare {

	public TextSquare(int x, int y, int width) {
		super(x, y, width);
	}

	@Override
	public void draw() {
		System.out.println("Sauare(" + getX() + "," + getY() + "," + getWidth() + ")");
	}

}
