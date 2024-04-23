package basic.ch19;

public class Customer {

	private String name;
		
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void useBankService(Bank bank) {
		bank.provideService(ServiceType.DEPOSIT, this);
	}
}
