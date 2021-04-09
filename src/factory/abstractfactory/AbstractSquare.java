package factory.abstractfactory;

public abstract class AbstractSquare implements Square {

	private int x;
	private int y;
	private int width;
	
	public AbstractSquare(int x, int y, int width) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
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

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

}