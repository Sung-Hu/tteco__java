package basic.useful.ch05;

public class MyThread2MainTest {

	public static void main(String[] args) {

		
		//문제 MyThread2 를 메모리에 올리고
		//그 안에 정의된 run() 메서드를 호출 하시오
		//힌트 --> Thread 문서를 반드시 확인 하시오.
		System.out.println("start main thread");
		MyThread2 myThread2 = new MyThread2();
		myThread2.run();
		//myThread2.run(); 일반 메서드 호출 임!!
		
		//새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 한다.
		Thread thread1 = new Thread(myThread2);
		thread1.start();

		System.out.println("end main thread");
	}

}
