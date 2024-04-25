package basic.starcraft.ver04;

public class StarcraftTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marin marin1 = new Marin("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		zealot1.showInfo();
		marin1.showInfo();
		zergling1.showInfo();
		System.out.println("----------------------");
		zealot1.attck(marin1);
		zergling1.attck(marin1);
		marin1.showInfo();
		
	}//end of main

}//end of class
