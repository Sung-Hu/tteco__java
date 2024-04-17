package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {
		
		//1부터 100까지 숫자 중에 3의 배수를 출력 하세요
		
		//1 ~ 100 -->>반복적인 패턴이 확인
		//만약 3의 배수라면 화면에 숫자를 출력하세요
		//반복문은 while 을 사용해 주세요

		int a = 1;

		//풀이 1
//		int b = 100;
//	
//		while(a <= b) {
//			
//		if((a % 3) == 0) {
//				
//			System.out.println("3의 배수는 : " + a);
//		}
//		a++;//식 사용하기 (무한 반복 예방)
//			} 
		//풀이 2
		boolean flag = true;
		while(flag) {	
			if( a % 3 == 0) {		
				System.out.println("3의 배수는 : " + a);
			}
		//특정 조건 멈추기
				if(a ==100) {
					flag = false;
				}
				a++;
		}
		

}// end of main

}// end of class
