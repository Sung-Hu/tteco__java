package basic.ch04;

public class breakTest1 {

	public static void main(String[] args) {
		
		//중간에 멈추는 break 문
		int i = 1;
	
		while (i < 11) {
			//단독 if 문은 수행이 될수도 있고 안될수도있다.
			if(i % 7 == 0) {
				//소수 7이면 반복문을 멈추어라
				break;
		}
			System.out.println("i의 값 : " + i);
			i++;
		}
		
	}//end of main

}//end of class
