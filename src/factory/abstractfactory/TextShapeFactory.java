package factory.abstractfactory;

public class TextShapeFactory implements ShapeFactory {

	@Override
	public Circle createCircle(int x, int y, int r) {
		return new TextCircle(x, y, r);
	}

	@Override
	public Square createSquare(int x, int y, int a) {
		return new TextSquare(x, y, a);
	}

	@Override
	public Rectangle createRectangle(int x, int y, int a, int b) {
		return new TextRectangle(x, y, a, b);
	}

}
