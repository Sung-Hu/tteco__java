package basic.exercise;

public class Exercise1 {

	//코드의 시작점
	public static void main(String[] args) {
		//1. 데이터 10, 100, 100 변수를 여러분들이 이름을 정해서 
		//선언하고 동시에 초기화 후 화면에 출력 하시오
		int a10 = 10;
		int a100 = 100;
		int b100 = 100;
				System.out.println(a10);
		System.out.println(a100);
		System.out.println(b100);
		//2. int ageBox 상자에 20을 담기
		int ageBox = 20;

		//2-1.ageBox 에 있는 값을 30으로 변경하고 기존에 있는
		//데이터를 다른 곳으로 옮기기
		int oldBox = ageBox;
		ageBox = 30;
		//아까있던 20은 어떻게 찾아 오지?
		System.out.println("ageBox : " + ageBox);
		System.out.println("oldBox : " + oldBox);
		
		//값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더
		//만들어서 넣어두면 된다.
		
		
		//3.int a = 1; int b= 3;
		//선언하고 a와 b에 담겨 있는 값을 서로 스위칭
		int a = 1;
		int b = 3;
		
		int temp = a;
		
		a = b;
		b = temp;

		
	}//end of main
	
}//end of class
