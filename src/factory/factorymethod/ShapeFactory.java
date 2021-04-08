package factory.factorymethod;

// 抽象工厂接口
public interface ShapeFactory {
	// 创建各种对象的方法，用参数指明要创建的具体对象
	Shape createShape(String type);
}
