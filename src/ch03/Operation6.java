package ch03;

import java.net.MulticastSocket;

/**
 * 빠른 평가란?
 * 논리 연산에 있어 첫 번째 조건이 결과를 결정할 때
 * 두 번째 조건을 평가 하지 않는 것을 의미한다.
 */
public class Operation6 {
	
	public static void main(String[] args) {
		
		int number = 5;
		int index = 0;
		
		//!!빠른평가가 동작하는 식을 만들어 보자.
		//논리곱을 이용한 빠른 평가 식을 만들어보자.
		boolean result = ( (number = number + 10) < 10) && ( (index = index + 2) < 10 );
		System.out.println("현재 number 변수의 값은 : " + number);
		System.out.println("현재 index 변수의 값은 : " + index);
		
		System.out.println("---------------------------------------");
		
		// number 값 재설정
		number = 5;
		//논리합을 이용한 빠른 평가 식을 만들어보자.
		//result = ( (number += 10) < 10 ) ||( (index += 2) < 10);
		//아래와 같은식이다.
		result = ( (number += 10) < 10 ) ||( (index += 2) < 10);
		
		//문제
		System.out.println("number : " + number);
		System.out.println("index : " + index);
		
		System.out.println("---------------------------------------");
		//도전문제 number 와 index 반대로 변경해서 출력해보자.
		result = ( (number += 10) >= 10 ) || ( (index += 2) > 10);
		System.out.println(number);
		System.out.println(index);
		
		
	}
}
