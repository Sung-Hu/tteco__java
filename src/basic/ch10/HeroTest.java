package basic.ch10;

public class HeroTest {

	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.setName("배병호");
		hero1.setPower(10);
		hero1.setDefense(10);
		hero1.setHp(2);
		hero1.showInfo();
		
		System.out.println("-----------------------------------");
		
		Hero hero2 = new Hero();
		hero2.setName("성후");
		hero2.setPower(1_000_000);
		hero2.setDefense(3_000_000);
		hero2.setHp(10_000_000);
		hero2.showInfo();

	}//end of main

}//end of class
