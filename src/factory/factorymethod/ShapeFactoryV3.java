package factory.factorymethod;

// 另一个具体工厂类（用继承扩展现有工厂类）
// 能创建 Circle, Square 和 Rectangle

public class ShapeFactoryV3 extends ShapeFactoryV1 implements ShapeFactory {

	///////////////////////////////////////////////////////
	// 创建各种对象的方法，用参数指明要创建的具体对象
	@Override
	public Shape createShape(String type) {
		System.out.println("Made in factory 3:");
		if (type.equals("Rectangle")) {
			return new Rectangle();
		} else {
			return super.createShape(type); // 调用超类方法
		}
	}

	///////////////////////////////////////////////////////
	// 测试工厂方法
	public static void main(String[] args) {
		String[] types = { "Circle", "Square", "Rectangle"};
		drawShapes(types, new ShapeFactoryV1());
		drawShapes(types, new ShapeFactoryV3());
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
