package factory.abstractfactory;

public class TextRectangle extends AbstractRectangle {

	public TextRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle(" + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + ")");
	}

}
