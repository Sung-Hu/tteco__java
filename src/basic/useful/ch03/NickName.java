package basic.useful.ch03;

public class NickName {
	
	private String nick;



	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws RuntimeException {
		if (nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다.");
		}
		if (nick.length() < 2) {
			throw new NickNameException("닉네임은 한글자가 될 수 없습니다.");
		}
		if (nick.matches("[a-zA-Z]+")) {
			throw new NickNameException("닉네임은 영어로만 입력할 수 있습니다.");
		}
		this.nick = nick;
	}

}
