package basic.ch23;

public class Father extends Thread {

	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	// 위임 시킬 일을 정의 할 예정
	@Override
	public void run() {
		// 1만원 입금 처리 - 다른 작업자 작업
		account.saveMoney(10_000);
		

	}
}
