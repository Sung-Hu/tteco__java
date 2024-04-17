package ch03;

public class Operation2 {
	
	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		//고민해볼 사항
		//int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		
		//문제
		//1. (12 + 3) / 3 값을 화면에 출력해 보세요
		//변수명, 데이터 유형은 스스로 결정하고 식을 만들어 보세요
		int plus = (12 + 3) / 3;
		System.out.println(plus);
		
		//2. (25 % 2) 값을 화면에 출력해 보세요
		//어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		double TWO = (25.0 % 2);
		System.out.println(TWO);
		
		//3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		double MA = (15 / 4);
		System.out.println(Math.abs(MA));
		
		//도전 문제
		//직접 산술 연산자 문제 만들기(2문제)
		
		//1. (66 / 17) / 3 의 절대 값을 출력하세요
		int mama = (66 / 17) / 3;
		System.out.println(Math.abs(mama));
		
		//2. 의원이 선거공략으로 부산시 국민 모두에게 10,000원을 주기로 했다.
		//부산시 국민의 수는 3,000,000명이다.
		//나라에서 금액지원 33%를 받을수 있을때
		//의원이 받을수 있는 총 지원 금액은?
		int busan = 3000000;
		int per = 10000;
		double KR = 0.33;
		double Money = (KR * per * busan);
		System.out.println(Money);

	}//end of main
}//end of class
