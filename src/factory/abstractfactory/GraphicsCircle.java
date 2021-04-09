package factory.abstractfactory;

import java.awt.Graphics;

public class GraphicsCircle extends AbstractCircle {

	public GraphicsCircle(int x, int y, int radius) {
		super(x, y, radius);
	}

	@Override
	public void draw() {
		GraphicsPainter.draw((Graphics g)-> {
				g.drawArc(getX(), getY(), 2 * getRadius(), 2 * getRadius(), 0, 360);
		});
	}

}
