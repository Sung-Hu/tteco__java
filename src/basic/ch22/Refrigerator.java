package basic.ch22;

public class Refrigerator extends HomeApp implements RemoteController , SoundEffect {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 연다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 닫는다");
	}

	@Override
	public void soundOn() {
		// TODO Auto-generated method stub
		System.out.println("또로롱~");
	}
	

}
