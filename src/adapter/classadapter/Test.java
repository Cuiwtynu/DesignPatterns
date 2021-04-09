package adapter.classadapter;

public class Test {

	public static void main(String[] args) {
		// Adapter 继承了 Adaptee 的功能，并实现了 Target 接口
		Target t = new Adapter();
		clientTest(t);
	}

	// 客户只接受符合 Target 接口的东西
	private static void clientTest(Target target) {
		System.out.println("Client: I need a Target to do it.");
		target.request();
		System.out.println("Client: OK, you did it.");
	}
}
