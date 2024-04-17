package basic.ch02;
/**
 *
 * 컴파일 시점과 -> .class 파일을 만들어 내는 과정이다.(Javac 라는 명령어가 동작함)
 * 런타임 시점 -> ctrl+F11 프로그램을 실행하는것 부터 실행종료 까지다.
 * 
 * java 라는 명령어는 프로그램을 실행 시키는 명령어 이다.
 * javac 라는 명령어는 번역하는 과정이다.
 * 
 * 자바 언어로 코드를 작성하고 있습니다
 * JDK 라는 도구를 설치 해야 자바 프로그래밍이 가능
 * JDK -> JRE(자바 프로그램 실행 환경이다)
 * JRE 안에는 JVM(자바 가상 머신) 이란게 있다
 * JVM 은 .class 파일을 실행 시켜주는 녀석이다.
 * JVM 은 어떤 연산을 거쳐 이진코드(바이너리 파일로 변환 시켜서 수행하는 녀석이다)
 */
public class Constant {
	//코드의 시작
	public static void main(String[] args) {

		//상수 선언 -> 값이 한번 정해지면 변경할 수 없는 수(값, 데이터)
		final int MAX_NUM = 10;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		//MAX_NUM = 100; //상수가 이미 선언되어서 컴파일 오류가 발생한다
		//ctrl + s 를 누르면 IDE 툴이 javac Constant.java 명령어를 수행한다.
		//명령어의 결과로 Constant.class 파일이 생성 된다.
		//why?? JVM 이 이해할 수 있는 언어 이기 때문에 번역을 해주어야 한다.
		
		System.out.println("----------------");
		//원주율 상수로 선언
		final double PI = 3.14159;
		//원의 반지름을 상수로 선언
		final int RADIUS = 10;
		
		//원의 둘레 계산
		System.out.println(2 * PI * RADIUS);
		//원의 면적 계싼 (원 내부의 공간의 크기)
		System.out.println(PI * RADIUS * RADIUS);
		
	}//end of main
}//end of class
