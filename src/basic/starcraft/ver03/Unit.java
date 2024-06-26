package basic.starcraft.ver03;
/**
 * public
 * protected -- 상속관계 설정할 수 있다.
 * default
 * private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
	}
	public void beAttacked(int power) {
		// 방어적 코드
		
		if(hp <= 0) {
			System.out.println(" [" + this.name + " ]이미 사망하였습니다.");
			hp = 0;
			return;
		} 
		hp -= power;
	}

	public void attack(Zergling m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
	}

	public void attack(Zealot z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	public void attack(Marin m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
	}
}
