package adapter.example.v2;

// 灯实现了 Switchable 接口，成为可开关的
// 问题：需要修改 Light 的代码（实现接口）
public class Light implements Switchable {
	
	@Override
	public void turnOn() {
		System.out.println("Light on");
	}

	@Override
	public void turnOff() {
		System.out.println("Light off");
	}

}
