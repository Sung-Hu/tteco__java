package basic.useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickName = new NickName();
		String inputNick = null;
		inputNick = "Aa";
		
		try {
			nickName.setNick(inputNick);
		} catch (NickNameException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
		}
	}

}
