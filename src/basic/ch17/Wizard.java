package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack() {
		System.out.println("마법사가 기본 공격을 합니다");
	}

	void freezing() {
		System.out.println(name + " 가 얼음 공격을 합니다");
	}

}
