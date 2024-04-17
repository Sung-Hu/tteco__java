package basic.ch09;

public class Warrior {

	String name;
	int level;
	int attackPower;
	int defensePower;
	
	public void levelup(int lev) {
		level++;
		attackPower++;
		defensePower++;
	}
	public void died(int die) {
		level--;
		attackPower--;
		defensePower--;
	}
	public void show() {
		System.out.println("레벨 : " + level);
		System.out.println("공격력 : " + attackPower);
		System.out.println("방어력 : " + defensePower);
	}
	

}
