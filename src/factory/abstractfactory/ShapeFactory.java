package factory.abstractfactory;

// 抽象工厂接口
public interface ShapeFactory {
	Circle createCircle(int x, int y, int r);
	Square createSquare(int x, int y, int a);
	Rectangle createRectangle(int x, int y, int a, int b);
}
