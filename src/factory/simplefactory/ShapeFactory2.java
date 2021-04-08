package factory.simplefactory;

// 简单工厂
// 把对象的创建抽取出来，封装在一个类里，让这个类统一负责对象的创建工作。

public class ShapeFactory2 {
	///////////////////////////////////////////////////////
	// 创建各种对象的方法，用参数指明要创建的具体对象
	public static Shape createShape(String type) {
		if (type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Square")) {
			return new Square();
		} else {
			return null;
		}
	}

	///////////////////////////////////////////////////////
	// 测试简单工厂
	public static void main(String[] args) {
		Shape c = ShapeFactory2.createShape("Circle");
		c.draw();
		Shape s = ShapeFactory2.createShape("Square");
		s.draw();
	}

	///////////////////////////////////////////////////////
	// 总结：
	// + 创建对象的工作都交由工厂类
	// + 当具体类发生变化时，只需要修改工厂类
	// - 工厂类对无法保持封闭（增加新的具体类时需要修改 if-else-if）

}
