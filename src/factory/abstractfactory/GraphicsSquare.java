package factory.abstractfactory;

import java.awt.Graphics;

public class GraphicsSquare extends AbstractSquare {

	public GraphicsSquare(int x, int y, int width) {
		super(x, y, width);
	}

	@Override
	public void draw() {
		GraphicsPainter.draw((Graphics g)-> g.drawRect(getX(), getY(), getWidth(), getWidth()));
	}
}
