package basic.ch22;

public abstract class HomeAppliances implements RaceParticipant {
	
	private final int speed = 2;

	public String getName() {
		return "깡총깡총거북이";
	}

	@Override
	public int getSpeed() {
		return speed;
	} 
	
}