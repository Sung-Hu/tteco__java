package basic.useful;

public class EBook {

	private int bookTypeId;
	private String title;
	private String author;

	public EBook(int bookTypeId, String title, String author) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}

	//Object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTypeId + "," + title + "," + author;
	}
	//Object 클래스에 있는 메서드를 재정의
	@Override
	public boolean equals(Object obj) {
		//1. EBook 클래스의 인스턴스가 맞다면
		if(obj instanceof EBook) {

			EBook tbook = (EBook)obj;
			//2. EBook 의 제목과 저자의 이름이 같다면 true 반환 시켜라
			if(this.title.equals(tbook.title)) {
			return true;
			}else {
				return false;
			}
		}

		return false;
	}


	public static void main(String[] args) {
		Book myBook1 = new Book("흐르는강물처럼", "파울로코엘료");
		
		EBook book1 = new EBook(1, "홍길똥", "허균");

		EBook book2 = new EBook(1, "홍길똥", "허균");
		System.out.println("------------------------------------------------------------");
		boolean result1 = book1 ==book2;
		System.out.println("result1 : " + result1);
		
		boolean result2 = book1.equals(book2);
		System.out.println("result2 : " +result2);
		
		if (book1.equals(book2)) {
			System.out.println("같은 주소를 가리킨다.");
		} else {
			System.out.println("아니야 다른 주소야");
		}
		System.out.println(book1);
		System.out.println(book2);
	}
}
