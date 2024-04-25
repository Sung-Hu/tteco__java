package basic.exercise.toy;

public class Poketmon extends ToyMachine {
	String origin;

	public Poketmon() {
		name = "피카츄";
		price = 10000;
		origin = "원산지 : 일본";
	}

	public void pika() {
		System.out.println("대사 : 피까?");
	}
}
