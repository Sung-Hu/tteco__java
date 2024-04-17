package basic.ch08;

public class Student {
	// 생성사 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 강제로 지시하는 것
	// 생성자는 객체를 생성할 때 반드시 존재해야한다.

	String name;
	int number;
	int grade;
	public Student() {}
	//생성자는 리턴 타입이 없다.
	//클래스 이름과 같다면(대문자까지 동일)
	//생성자라고 부를수 있다.
	public Student(String s, int n1, int n2) { //기본생성자
	name = s;
	number = n1;
	grade = n2;
	//중요 별3개!!!!!!
	//생성자는 객체가 처음 만들어 질때
	//제일 먼저 수행하는 코드 입니다!!
	}
	
	
	//매소드 정의
	public void showInfo() {
		System.out.println("학생의 이름은 " +name);
		System.out.println("학생의 번호는 " +number);
		System.out.println("학생의 학년은 " +grade);
		
	}
	//기본생성자는 컴파일러가
	//.class 파일을 만들 때
	//사용자 정의 생성자가 하나도 없다면
	//자동으로 코드를 넣어준다

	//사용자 정의 생성자란 뭘까?
	//클래스 설계자가 인스턴스화 했을 때
	//정상적으로 동작해야 하는 초기값들이
	//필요하다면 강제성을 부여한다.
	
}// end of class
