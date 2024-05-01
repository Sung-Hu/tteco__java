package basic.useful.ch04;

public class AICar extends Car {

	@Override
	void drive() {
System.out.println("AI Car 자율 주행을 합니다.");
	}

	@Override
	void stop() {
System.out.println("AI Car 자율 주행을 멈춥니다");
	}

}
