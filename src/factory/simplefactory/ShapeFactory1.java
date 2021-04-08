package factory.simplefactory;

// 简单工厂
// 把对象的创建抽取出来，封装在一个类里，让这个类统一负责对象的创建工作。

public class ShapeFactory1 {
	///////////////////////////////////////////////////////
	// 创建各种对象的方法
	public static Circle createCircle() {
		return new Circle();
	}
	
	public static Square createSquare() {
		return new Square();
	}
	
	///////////////////////////////////////////////////////
	// 测试简单工厂
	public static void main(String[] args) {
		Shape c = ShapeFactory1.createCircle();
		c.draw();
		Shape s = ShapeFactory1.createSquare();
		s.draw();
	}
	
	///////////////////////////////////////////////////////
	// 总结：
	// + 创建对象的工作都交由工厂类
	// + 当具体类发生变化时，只需要修改工厂类
	// - 工厂类对无法保持封闭（增加新的具体类时需要修改）

}
