package ch03;

import java.net.MulticastSocket;
//import = 수입하다, 가지고 오다
import java.util.Scanner;


public class Operation8_1 {
	public static void main(String[] args) {
		
		System.out.println("작은 수를 구하시오");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("x 의 값은 : " + x);
		double y = sc.nextDouble();
		System.out.println("y 의 값은 : " + y);
		
		double T = x > y  ?  x : y;
		System.out.println("두 수 중에 큰 수는 " + T + "입니다" );

		
	}
}
