package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator2 {
	public static void main(String[] args) {

		//사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력 하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력 하세요");
		int maxNumber = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= maxNumber; i += 3) {
			sum = sum + i;
			System.out.print("sum : " + sum + " \n");
		}
		System.out.println("sum : " + sum);
	}//end of main
}//end of class
