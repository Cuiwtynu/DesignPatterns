package adapter.example.v1;

//用开关控制灯
public class Test {
	
	public static void main(String[] args) {
		// 控制灯的开关
		Switch s = new Switch(new Light());
		// 打开开关
		s.turnOn();
		// 关闭开关
		s.turnOff();
	}

}
