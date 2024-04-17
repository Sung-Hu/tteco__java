package basic.ch10;

public class BankTest {

	public static void main(String[] args) {

		Bank bank1 = new Bank();
		bank1.name = "우리은행";
		bank1.deposit(10_000);
		int getmoney = bank1.withdraw(5_000); // 리턴 타입이
		System.out.println(">>>>>>출금>>>>>>>");
		System.out.println("금액 : " + getmoney);

		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정을 한다면...?
		// Bank 에 돈을 넣으려면 deposit() 기능으로 만들어져있다
		// bank1.balance = 100_000; <--private 로 변경 후 정보 은닉 되었다.
		// 이렇게 덮어쓰기가 된다면
		// 의도하지 않은 실수를 발생 시킬 수 있다.
		// Bank 폴더로 가서 int balance 에 private 태그(은닉태그) 를 사용해서
		// 막을수 있다
		bank1.deposit(100_000);
		// 실행의 흐름을 만들 예정...
		// 현재 은행에 전체 잔고가 200_000원 이하라면
		// 본점에 금액 요청상황을 해야한다
		System.out.println(bank1.getBlance());
		int money = bank1.getBlance();
		if (money <= 200_000) {
			System.out.println("본점에 금액을 요청해 주세요");
		}
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		
		bank1.setBalance(1_000_000);
		System.out.println(bank1.getBlance());
		

	}// end of main

}// end of class