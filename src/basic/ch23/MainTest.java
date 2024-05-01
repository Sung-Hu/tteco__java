package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		// 아버지 클래스 new
		// 생성자 의존 주입( DI )
		Father father = new Father(account);
		father.start();
		// 어머니 클래스 new
		Mother mother = new Mother(account);
		mother.start();
		
		int resultMoney = account.getMoney();
		System.out.println("현재 잔액은 : " + resultMoney);
		
		//정상적 처리는 : 10만원 + 아버지 입금 1만원 - 어머니 출금 5천원 = 10만 5천원
	}
}
