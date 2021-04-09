package adapter.classadapter;

// 类适配器继承 Adaptee 的功能，并实现了 Target 接口
// 既使用了 Adaptee 的功能（也不改变它的接口）
// 又实现了 Target 接口，满足了客户的要求

public class Adapter extends Adaptee implements Target  {

	@Override
	public void request() {
		System.out.println("Adapter: I'm an Adaptee.");
		System.out.println("Adapter: Let me do it as an Adaptee.");
		specificRequest();
	}

}
