package adapter.example.v2;

// 用开关控制灯和其他对象
public class Test {
	
	public static void main(String[] args) {
		// 用开关和灯
		Switch s = new Switch(new Light());
		// 打开开关
		s.turnOn();
		// 关闭开关
		s.turnOff();
		
		// 用开关控制门
		Switch s1 = new Switch(new Door());
		// 打开开关
		s1.turnOn();
		// 关闭开关
		s1.turnOff();
	}

}
