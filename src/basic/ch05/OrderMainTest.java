package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {
		Order orderBox1 = new Order(); 
		Order orderBox2 = new Order(); 
		
		orderBox1.title = "고양이";
		orderBox1.author = "치즈고양이";
		orderBox1.age = 1;
		orderBox1.pricse = 50000;
		
		System.out.println(orderBox1.title);
		System.out.println(orderBox1.author);
		System.out.println(orderBox1.age + ("개월"));
		System.out.println(orderBox1.pricse +("원"));
		
		orderBox2.title = "고양이";
		orderBox2.author = "검정고양이";
		orderBox2.age = 1;
		orderBox2.pricse = 70000;
		
		System.out.println(orderBox2.title);
		System.out.println(orderBox2.author);
		System.out.println(orderBox2.age + ("개월"));
		System.out.println(orderBox2.pricse +("원"));
		
		orderBox2.title = "고양이";
		orderBox2.author = "카오스고양이";
		orderBox2.age = 1;
		orderBox2.pricse = 40000;
		
		System.out.println(orderBox2.title);
		System.out.println(orderBox2.author);
		System.out.println(orderBox2.age + ("개월"));
		System.out.println(orderBox2.pricse +("원"));

	}

}
