package adapter.example.v1;

// 开关
// 问题：Switch 依赖具体对象 Light，随被控对象的改变而改变，不能保持封闭
// 违反 DIP 和 OCP

public class Switch {
	
	// 被控对象是灯
	private Light light;
	
	public Switch(Light light) {
		this.light = light;
	}
	
	public void turnOn() {
		System.out.println("Switch on ->");
		light.turnOn();
	}
	
	public void turnOff() {
		System.out.println("Switch off ->");
		light.turnOff();
	}
	
}
