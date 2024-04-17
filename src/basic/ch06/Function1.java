package basic.ch06;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		
		System.out.println(calcSum(7, 200));
		
	}//end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	//연습 문제
	//함수를 수정해 주세요 -- 파라메터 정수 2개를 받을수 있도록 설계
	//s1, s2 -->
	//1 , 10 --> 55
	//7 , 200--> 7 + 8 + 9 + .... 
	static int calcSum(int s1, int s2) {
		int sum = 0; 
		int i;
		for(i = s1; i<= s2; i++ ) { // 횟수 100 번 동작 하는 녀석 
			//   0 = 0 + 1
			//   1 = 1 + 2
			//   3 = 3 + 3
			sum = sum + i; // 5050 
		}
		return sum;
	}
	
}//end of class
