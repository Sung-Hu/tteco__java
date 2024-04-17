package basic.ch07;

import java.net.MulticastSocket;

public class Student {
	
	//클래스 안에 속해 있어서
	//멤버 변수 라고 한다
	//특징은 초기화 값을 넣지 않는다면 기본 값으로 초기화 된다.
	//new... 생성자(); -> heap 메모리에 올라 갔을 시 값이 없다면 기본값으로 초기화 된다.
	
	int studentID;
	String studentName;
	String address;
	
	//메소드 설계 하기
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");	
	}
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");	
	}
	public void showInfo() {
		System.out.println("----------상태창--------------");	
		System.out.println("학생 ID : " + studentID);	
		System.out.println("학생 이름 : " + studentName);	
		System.out.println("학생 주소 : " + address);	
	}
	
	//메소드란?
	//객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	//멤버 함수 라고도 한다
	//메소드의 특징은 - 멤버 변수를 활용해서 기능을 구현한다.
	
	//연습문제
	//1.시험을 친다(takeTest). studentID + "학생이 시험을 친다"
	
	//2.청소를 한다. cleanUp, studentName + " 학생이 청소를 합니다"
	
	public void takeTest() {
		System.out.println(studentName + "학생이 시험을 칩니다");
	}
	public void cleanUp() {
		System.out.println(studentName + "학생이 청소를 합니다");
	}

}//end of class
