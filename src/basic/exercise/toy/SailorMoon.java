package basic.exercise.toy;

public class SailorMoon extends ToyMachine {
	String Type;

	public SailorMoon() {
		name = "세일러문";
		price = 5000;
		Type = "유형 : 마법소녀";
	}

	public void magic() {
		System.out.println("대사 : 정의의 이름으로 널 용서하지 않겠다");

	}
}
