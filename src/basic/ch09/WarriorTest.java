package basic.ch09;

import java.util.Scanner;

public class WarriorTest {
	public static void main(String[] args) {
		
		boolean flag = true;
		Warrior w1 = new Warrior();
		w1.name = "남자";
		w1.level = 10;
		w1.attackPower = 100;
		w1.defensePower = 50;
		
		System.out.println("1.현질하고 돌격!, 2.무기사고 돌격!, 3.도망치기");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		
		while(flag) {
			if(choice == 1) {
				w1.levelup(1);
				System.out.println("이겼다! 레벨업!!!!");
				w1.show();
				return;
			}
			else if (choice == 2) {
				w1.died(1);
				System.out.println("죽었다! 레벨 다운ㅠㅠ");
				w1.show();
				return;
			}
			else if (choice == 3) {
				System.out.println("사나이의 길에서 도망쳤다");
				w1.show();
				return;
			}
			else {
				System.out.println("숫자를 읽을줄 모르시나요?");
				return;
			}
			
		}
		
	}//end of main

}//end of class
