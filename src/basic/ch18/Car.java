package basic.ch18;

import java.security.PublicKey;

public class Car {

	String name;
	int price;
	Engine engine; 
	//포함(컴포지션) 관계
	//객체 안에 필요 관계를 직접 생성할 경우 포함(Composition) 관계라고 한다!
	
	public Car() {
		engine = new Engine();
		//Car 라는 객체가 생성이 될 때
		//Engine 객체도 함께 생성이 된다.
	}
		
		public void startCar() {
			engine.start();
			System.out.println("자동차가 출발합니다");
		}
		public void stopCar() {
			engine.stop();
			System.out.println("자동차가 멈춥니다");
		}
	}

