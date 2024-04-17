package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	//getter, setter 메서드를 만들어 주세요
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getIsDie() {
		return this.isDie;
	}


	public void showInfo() {
		System.out.println("영웅의 이름은 : " + name);
		System.out.println("영웅의 체력은 : " + hp);
		System.out.println("영웅의 전투력은 : " + (power + defense));
	}
	
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	public void setDefense(int inputDefense) {
		this.defense = inputDefense;
	}
	public void setIsDie(Boolean inputIsDie) {
		this.isDie = inputIsDie;
	}

}
