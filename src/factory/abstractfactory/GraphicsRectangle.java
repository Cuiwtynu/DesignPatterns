package factory.abstractfactory;

import java.awt.Graphics;

public class GraphicsRectangle extends AbstractRectangle {

	public GraphicsRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw() {
		GraphicsPainter.draw((Graphics g)-> {
			g.drawRect(getX(), getY(), getWidth(), getHeight());
		});
	}
}
