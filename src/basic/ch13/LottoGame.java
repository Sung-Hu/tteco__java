package basic.ch13;

public class LottoGame {

	public static void main(String[] args) {
		
		int gameNumber1 = LoottoNumberMaker.makeNumber();
		int gameNumber2 = LoottoNumberMaker.makeNumber();
//		int gameNumber3 = LoottoNumberMaker.makeNumber();
//		int gameNumber4 = LoottoNumberMaker.makeNumber();
//		int gameNumber5 = LoottoNumberMaker.makeNumber();
//		int gameNumber6 = LoottoNumberMaker.makeNumber();

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
		//예상 1box = 5 , 2box = 3
		int a = 0;
		//오름 차순으로 정렬해보기
		//만약 1상자가 2상자보다 크다면 어떤 행동을 하라
		if(gameNumber1 > gameNumber2) {
			//0  =  3  -->a == 3
			//0  =  5  -->a == 5
			a = gameNumber2;
			//3
			gameNumber1 = gameNumber2;
			//5
			gameNumber2 = a;
		}
		System.out.println("---------------");
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
	}//end of main

}//end of class
