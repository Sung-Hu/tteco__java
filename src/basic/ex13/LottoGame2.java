package basic.ex13;

import java.util.Random;

public class LottoGame2 {

	Random random = new Random();
	//                                  
	int resultNumber = random.nextInt(45) + 1; 
	
	

	public static void main(String[] args) {
		
		int gameNumber1 = LoottoNumberMaker.makeNumber();
		int gameNumber2 = LoottoNumberMaker.makeNumber();
		int gameNumber3 = LoottoNumberMaker.makeNumber();
		int gameNumber4 = LoottoNumberMaker.makeNumber();
		int gameNumber5 = LoottoNumberMaker.makeNumber();
		int gameNumber6 = LoottoNumberMaker.makeNumber();


		//전체 1~6까지 나온 결과값을 오름 차순으로 정렬
		//단 중복 값은 제외한다
		//만약 if --> 반복문 사용 금지 if 문 6개로 해결
		int i = 0;
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		if(gameNumber1 > gameNumber2) {
			i = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = i;
		}
		if(gameNumber2 > gameNumber3) {
			i = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = i;
		}
		if(gameNumber3 > gameNumber4) {
			i = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = i;
		}
		if(gameNumber4 > gameNumber5) {
			i = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = i;
		}
		if(gameNumber5 > gameNumber6) {
			i = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = i;
		}
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		
	}//end of main

}//end of class
