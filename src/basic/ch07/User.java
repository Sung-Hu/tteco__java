package basic.ch07;

public class User {
	String id;
	String password;
	String name;
	String gender;
	int age;

	// 패스워드 체크 기능 만들어 보기
	// 동사로 시작하는것을 권장
	public boolean checkPassword(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가있는
		// password 값과 외부에서 넣을 inputPwd 값이
		// 같다면 true 를 반환하고 아니면 false 를 반환하라
		// == 주소값, 산술식 사용한다.
		// 문자열 비교는 equals 라는 메서드를 사용한다.

		if (password.equals(inputPwd)) {
			return true;
		}
		return false;
	}

	// 독립적인 함수로서 여기서 실행 시킬수 있다.
	public static void main(String[] args) {
		//User 클래스를 인스턴스화 시켜 주세요.
		User user1 = new User(); //메모리에 올라간다.(heap)
		user1.password = "123";
		
		User user2 = new User();
		user2.password = "555";
		
		System.out.println("--------------------");
		
		//user1 pwd 를 확인하고 싶다
		boolean user1Result = user1.checkPassword("333");
		System.out.println("user1 : " + user1Result);
		boolean user1Result2 = user1.checkPassword("123");
		System.out.println("user1 두번째 결과 : " + user1Result2);
		
		System.out.println("-----------------------");
		//참조 변수 user2 기능인 checkPassword 호출해서 결과를 확인 해주세요
		// --F
		// --T
		
		//실행의 흐름을 만드는 방법 연습이다
		//if 구문을 활용해서 콘솔창에 
		//비밀번호가 틀렸습니다. 혹은 비밀번호가 맞습니다. 출력
		
		boolean user2R = user2.checkPassword("123");
		System.out.println(user2R);
		boolean user2R2 = user2.checkPassword("555");
		System.out.println(user2R2);
		}
		

	

}// end of class
