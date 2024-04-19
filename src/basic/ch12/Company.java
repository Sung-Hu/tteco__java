package basic.ch12;

public class Company {

	public static String companyName = "그린컴퍼니";
	static int eepSerialNumber = 1000;
	
	
	//코드 테스트
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("홍길동");
		System.out.println(emp1.getEmployeeId());
		Employee emp2 = new Employee("이순신");
		System.out.println(emp2.getEmployeeId());
		Employee emp3 = new Employee("강감찬");
		System.out.println(emp3.getEmployeeId());
	}
}
