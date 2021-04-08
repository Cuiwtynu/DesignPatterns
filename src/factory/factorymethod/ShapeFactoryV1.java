package factory.factorymethod;

// 一个具体工厂类
// 能创建 Circle 和 Square

public class ShapeFactoryV1 implements ShapeFactory {

	///////////////////////////////////////////////////////
	// 创建各种对象的方法，用参数指明要创建的具体对象
	@Override
	public Shape createShape(String type) {
		System.out.println("Made in factory 1:");
		if (type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Square")) {
			return new Square();
		} else {
			return null;
		}
	}

	///////////////////////////////////////////////////////
	// 测试工厂方法
	public static void main(String[] args) {
		String[] types = { "Circle", "Square", "Rectangle"};
		drawShapes(types, new ShapeFactoryV1());
	}

	// 该方法不依赖于具体的工厂类，可以对具体工厂类的变化保持封闭
	private static void drawShapes(String[] types, ShapeFactory shapeFactory) {
		for (String type : types) {
			Shape s = shapeFactory.createShape(type);
			if (s != null) {
				s.draw();
			} else {
				System.out.println(type + " not supported");
			}
		}
	}
}