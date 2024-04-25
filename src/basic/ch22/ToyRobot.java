package basic.ch22;

public class ToyRobot implements RemoteController {
	int width;
	int height;
	String color;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("로봇을 켭니다.");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("로봇을 끕니다.");
	}
	
	//turnOn
	//turnOff
}
