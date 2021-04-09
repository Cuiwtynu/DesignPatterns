package factory.abstractfactory;

// 测试抽象工厂
// 产品类
//Shape 产品总接口
// Circle 第一种产品的接口
//  AbstractCircle 抽象类实现 getters setters constructor
//   TextCircle 具体产品类（文字的）
//   GraphicsCircle 具体产品类（图形的）
// Square 第二种产品的接口
//  AbstractSquare 抽象类实现 getters setters constructor
//   TextSquare 具体产品类（文字的）
//   GraphicsSquare 具体产品类（图形的）
// Rectangle 第三种产品的接口
//  AbstractRectangle 抽象类实现 getters setters constructor
//   TextRectangle 具体产品类（文字的）
//   GraphicsRectangle 具体产品类（图形的）
// 抽象工厂
// ShapeFactory 抽象工厂接口
//  TextShapeFactory 具体工厂（文字的）
//  GraphicsShapeFactory 具体工厂（图形的）
//
// 使用不同的具体工厂类，可以创建不同系列的具体产品
//

public class Test {

	public static void main(String[] args) {
		ShapeFactory sf = new TextShapeFactory();
		sf.createCircle(100, 100, 50).draw();
		sf.createSquare(100, 100, 50).draw();
		sf.createRectangle(100, 100, 50, 80).draw();
		
		ShapeFactory sf2 = new GraphicsShapeFactory();
		sf2.createCircle(100, 100, 50).draw();
		sf2.createSquare(100, 100, 50).draw();
		sf2.createRectangle(100, 100, 50, 80).draw();
	}
}
