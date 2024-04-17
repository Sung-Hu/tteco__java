package basic.ch09;

public class Subway {
	int lineNumber;
	int passngerCount;
	int money;
	
	public Subway(int line) {
		lineNumber = line;
	}
	
	//지하철도 승객을 태우다.
	public void take(int pay) {
		money += pay;
		passngerCount++;
		
	}
	
	public void showInfo() {
		System.out.println("지하철 번호 : " + lineNumber);
		System.out.println("지하철 승객수 : " + passngerCount);
		System.out.println("지하철 수익금 : " + money);
	

	}
}
