package basic.ch01;

/**데이터 타입이란
 * 상자에 들어 갈 수 있는 값의 유형과 크기를 지정하는 것
 */
public class DataType1 {
	
	//코드의 시작점
	public static void main(String[] args) {
		
		//데이터 타입에 종류
		//1. 기본 자료형 (primitive data type)
		//2. 참조 타입 (Reference type)
		
		
		//기본 자료형
		//[정수형, 문자형(문자열x), 실수형, 논리형] 4가지로 구분 할 수 있다.
		
		//정수형 - 정수는 소수점 이하를 포함하지 않는 숫자를 의미 합니다.
		//1, 2, -5, 100등은 모두 정수 입니다.
		
		byte byteBox;       //1바이트 ->네모칸 한칸은 1bit -> 8bit -> 1byte;
		short shortBox;     //2바이트 ->16bit = 2byte
		int intBox;         //4바이트 ->32bit = 4byte
		long longBox;       //8바이트 ->64bit = 8byte
		
		
		//위 상자들은 정수값을 담을 수 있는 상자인데 크기가 정해져 있다.
		byteBox = -128;
		byteBox = 127;
		
		shortBox = -32768;
		shortBox = 32767;
		
		//int 는 약 +-21억 까지 다룰수있다.
		intBox = -2147483648;
		intBox = 2147483647;
		
		//long 은 약 +-경까지 다룰수 있다.
		longBox = -9223372036854775808L; //숫자 마지막에 있는 L은 접미사 라고 한다.
		longBox = 9223372036854775807L; //int 값이 아니라 long 값이라는 표시용도
		
		//L value = R value
		//보통 오른쪽에 기술 되는 수의 기본단위는 int형으로 먼저 인지한다.
		//정수형에 기본 연산 단위는 int형 이다.
		

	}// end of main
}// end of class
