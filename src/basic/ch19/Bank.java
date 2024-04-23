package basic.ch19;

public class Bank {

	private String name;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void provideService(ServiceType serviceType, Customer customer) {
		switch(serviceType) {
		case ACOUNT_INFO:
			System.out.println(customer.getName() + "계좌 정보 조회를 합니다.");
			break;
		case DEPOSIT:
			System.out.println(customer.getName() + "입금을 진행 합니다.");
			break;
		case WITHDRAW:
			System.out.println(customer.getName() + "출금을 진행 합니다.");
			break;
			default:
				System.out.println(customer.getName() + "해당 서비스는 제공하지 않습니다.");
		}
		//서비스종류
		//if , switch
		//계좌정보 조회, 입금, 출금
	}
	
	public void showAccountInfo(Customer customer) {
		System.out.println("사용자 이름을 출력 합니다");
		System.out.println("이름 : " + customer.getName());
		
	}
}
