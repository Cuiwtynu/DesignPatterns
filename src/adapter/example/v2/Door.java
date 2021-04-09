package adapter.example.v2;

// 门实现接口 Switchable 成为可开关的
public class Door implements Switchable {

	public void open() {
		System.out.println("Door open");
	}
	
	public void close() {
		System.out.println("Door close");
	}
	
	@Override
	public void turnOn() {
		open();
	}

	@Override
	public void turnOff() {
		close();
	}

}
