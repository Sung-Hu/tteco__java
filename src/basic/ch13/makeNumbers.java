package basic.ch13;

import java.util.Random;

public class makeNumbers {
	// 인스턴스에 속하지 않는 함수 만들기 
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면 
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다. 
		for(int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;
			// for -> 중복된 숫자가 없도록 코드를 완성하시오 
			//[0] 3. 
			//[1] 3. 
			numbers[i] = num;
			for(int j = 0; j < i; j++) {
				//j --> 0 , i --> 1
				if(numbers[j] == numbers[i]) {
                  i--; 
                  break;
				}
			}
		}
		
		return numbers;
	}
}
