package basic.ch07;

public class BaramTest {

	public static void main(String[] args) {
		Baram man = new Baram();
		man.name = "타락파워전사";
		man.class1 = "전사";
		man.level = 99;
		man.address = "고구려 동쪽";
		man.sex = "남자";
		man.show();
		System.out.println();
		
		Baram fem = new Baram();
		fem.name = "타락파워주술사";
		fem.class1 = "주술사";
		fem.level = 87;
		fem.address = "부여성 서쪽";
		fem.sex = "여자";
		fem.show();
		System.out.println();

		Baram dar = new Baram();
		dar.name = "도닥붕";
		dar.class1 = "도적";
		dar.level = 98;
		dar.address = "장안성 남쪽";
		dar.sex = "남자";
		dar.show();
		System.out.println();

	}

}
