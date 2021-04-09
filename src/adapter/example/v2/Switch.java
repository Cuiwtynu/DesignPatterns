package adapter.example.v2;

// 抽象的开关
// 依赖抽象的可开关接口，对于被控对象的改变保持封闭
// 符合 DIP 和 OCP

public class Switch {
	
	// 被控对象是可开关的
	private Switchable target;
	
	public Switch(Switchable target) {
		this.target = target;
	}
	
	public void turnOn() {
		System.out.println("Switch on ->");
		target.turnOn();
	}
	
	public void turnOff() {
		System.out.println("Switch off ->");
		target.turnOff();
	}
	
}
