package basic.exercise;

public class PhoneBook {

	private String phoneNumber;
	private String name;
	
	public PhoneBook(String phoneNumber, String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}//end of class
