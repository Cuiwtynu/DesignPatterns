package adapter.classadapter;

// 已存在的类，提供了需要的功能
// 但不符合客户需要的 Target 接口
// 且不允许修改

public class Adaptee {
	
	public void specificRequest() {
		System.out.println("Adaptee: I can do it.");
	}

}
