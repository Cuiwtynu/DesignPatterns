package factory.abstractfactory;

public abstract class AbstractCircle implements Circle {

	private int x;
	private int y;
	private int radius;

	public AbstractCircle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void setRadius(int r) {
		this.radius = r;
	}

	@Override
	public int getRadius() {
		return radius;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}