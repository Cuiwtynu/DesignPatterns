package adapter.objectadapter;

// 对象适配器实现 Target 接口，并把具体工作委托给一个 Adaptee 对象
// 既使用了 Adaptee 的功能（也不改变它的接口）
// 又实现了 Target 接口，满足了客户的要求

public class Adapter implements Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		System.out.println("Adapter: I can use Adaptee to do it ");
		adaptee.specificRequest();
	}

}
