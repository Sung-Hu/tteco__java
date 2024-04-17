package basic.exercise;

public class doubleFor3 {

	public static void main(String[] args) {

		for (int a = 0; a < 5; a++) {

			for (int b = 0; b <= a; b++) {

				if (b == 0 || a == 0) {
					
					System.out.print("*");
				} 
				else {
					System.out.print("**");
				}
			}
			System.out.println();
		}
	}// end of main

}// end of class
