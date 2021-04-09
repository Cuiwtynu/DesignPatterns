package factory.abstractfactory;

public class GraphicsShapeFactory implements ShapeFactory {
	
	@Override
	public Circle createCircle(int x, int y, int r) {
		return new GraphicsCircle(x, y, r);
	}

	@Override
	public Square createSquare(int x, int y, int a) {
		return new GraphicsSquare(x, y, a);
	}

	@Override
	public Rectangle createRectangle(int x, int y, int a, int b) {
		return new GraphicsRectangle(x, y, a, b);
	}

}
