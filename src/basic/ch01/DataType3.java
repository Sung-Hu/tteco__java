package basic.ch01;

public class DataType3 {
	
	//메인 함수 - 코드의 시작점
	public static void main(String[] args) {
		
		//기본 데이터 타입
		//참조 타입
		
		//기본 데이터 타입 - 실수형
		//float, double
		
		//float 은 4바이트
		float floatBox1 = 0.5f; //접미사를 사용할 땐 대, 소문자가 상관없다.
		float floatBox2 = 0.5F; //접미사를 사용할 땐 대, 소문자가 상관없다.
		
		//double 은 8바이트. 실수에 기본 연산단위 이고 그 이유는
		//소수점을 더 많이 표현할 수 있기 때문에 값에 정확도를 높일 수 있다.
		double doubleBox1 = 0.123;
		double doubleBox2 = 1.12345678;
		
		//콘솔창 결과 출력 - 콘솔창에서는 기본적으로 정확한 데이터 타입을
		//확인할 수 없다.
		System.out.println(floatBox1);
		System.out.println(doubleBox1);
		
		System.out.println(0.5f);
		System.out.println(0.10d); //d 는 쓰지않아도 기본값이 double 이다.
		

	}// end of main
}// end of class
