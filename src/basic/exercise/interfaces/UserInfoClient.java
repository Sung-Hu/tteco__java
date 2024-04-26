package basic.exercise.interfaces;

public class UserInfoClient {

	public static void main(String[] args) {

		//사용자에게 정보를 입력하세요 -->Saccner 활용
		String inputUserName = "홍길동";
		String inputuserPw = "asd123";
		
		//DTO : 데이터들을 받아서 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo info1 = new UserInfo(inputUserName, inputuserPw);
		
		//데이터를 받아서 IUserInfoDao 를 구현한 구현 클래스에게 전달하고자 한다.
		//UserInfoMySqlDaolmpl, UserInfoOracleImpl
		//IUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaolmpl();
		IUserInfoDao iUserInfoDao1 = new UserInfoOracleImpl();
		
		iUserInfoDao1.insertUserInfo(null);
		iUserInfoDao1.updateUserInfo(null);
		iUserInfoDao1.deleteUserInfo(0);;
		iUserInfoDao1.selectUserInfo();;
	}//end of main

}//end of class
