package basic.ch22;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog(); //다형성, 업캐스팅 된 상태
		Animal bird = new Bird();
		
		dog.eat();
		dog.move();
		
		bird.eat();
		bird.move();
	}//end of main

}//end of class
