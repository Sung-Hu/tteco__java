package basic.ch06;

public class Student2 {
//코드의 시작점
	public static void main(String[] args) {

		greet("김성후");

		int result1 = square(3);
		int result2 = square(10);
		System.out.println("제곱은 : " + result1);
		System.out.println("제곱은 : " + result2);

		boolean adult = cheakAdult(20);
		boolean child = cheakAdult(10);

		System.out.println("성인 입니다 " + adult);
		System.out.println("성인이 아닙니다 " + child);

		String plus = signOfNumber(1);
		String min = signOfNumber(-1);
		String zero = signOfNumber(0);

		System.out.println(plus);
		System.out.println(min);
		System.out.println(zero);

		int big1 = findMax(99, 100);
		int big2 = findMax(-190, 1020);
		System.out.println("입력 받은 값중 더 큰 수는 " + big1 + "입니다");
		System.out.println("입력 받은 값중 더 큰 수는 " + big2 + "입니다");

	}// end of main
	
//인사말 출력하기
	//함수이름 greet
	//입력 : 이름 (String)
	//설명 : 사용자의 이름을 입력받아 "안녕하세요,[이름]님!" 이라고 콘솔에 출력
	static void greet(String name) {
		
		System.out.println("안녕하세요, [" + name + "]님!");
	}//end of greet
	
//제곱 계산하기
	//함수이름 square
	//입력 : 정수 (int)
	static int square(int s1) {
		int a = s1 * s1;
		return a;
	}//end of square
	
//나이 확인
	//함수이름 cheakAdult
	//입력 : 나이 (int)
	//출력 : 성인여부 (Boolean)
	//설명 : 입력받은 나이가 18세 이상이면 true 아니면 false 출력
	static boolean cheakAdult(int age) {
		boolean c = true;
		if (age >= 18) {
			c = true;
		} else {
			c = false;
		}
		return c;
	}//end of cheakAdult
	
//수의 부호 판별
	//함수이름 : signOfNumber
	//입력 : 정수 (int)
	//출력 : 문자열 (String)
	//설명 : 입력받은 정수의 부호에 딸가 positive, negative, zero 셋중 하나를 출력
	static String signOfNumber(int num) {
		String si;
		if (num > 0) {
			si = "positive";
		} 
		else if (num == 0) {
			si = "zero";
		} 
		else {
			si = "negative";
		}
		return si;
	}//end of signOfNumber
	
//최대값 찾기 함수
	//함수이름 : findMax
	//입력 : 정수 배열
	//출력 : 입력 받은 값 중 가장 큰 수
	static int findMax(int a, int b) {
		int bigger = 0;
		if (a > b) {
			bigger = a;
		} else {
			bigger = b;
		}
		return bigger;
	}//end of findMax
	
}// end of class