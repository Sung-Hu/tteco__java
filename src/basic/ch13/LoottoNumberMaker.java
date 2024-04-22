package basic.ch13;

import java.util.Random;

public class LoottoNumberMaker {
	
	//멤버 변수

	private String version = "1.0.0";
	
	//main 함수
	public static void main(String[] args) {
		
		makeNumber();
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		
	}//end of main

	//인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		//static 함수안에 멤버 변수를 사용할 수 없다.
		//메모리가 뜨는 순서 !!
		//System.out.println("ver : " + version);
		// 자바 도구 -- 표준 API
		// 난수 발생기 -> 랜덤적인 값을 생성
		Random random = new Random();
		//                                  +1을 하면 0이 나오지 않는다
		int resultNumber = random.nextInt(45) + 1; // 45로 설정하면 0~~44까지 만든다
		
		
		return resultNumber;
	}
}//end of class
