package basic.starcraft;

import structure.TencoIntArray;

public class MainTest1 {

	public static void main(String[] args) {
		
		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElenent(100);
		tencoIntArray.addElenent(200);
		tencoIntArray.addElenent(300);
		tencoIntArray.addElenent(400);
		
		// tencoIntArray.insertElement(1, 50);
		
		// System.out.println(tencoIntArray.getElement(0));
		tencoIntArray.printAll();
		System.out.println("---------------------------------");
		System.out.println(tencoIntArray.getCountSize());
		System.out.println("---------------------------------");
		System.out.println(tencoIntArray.isEmpty());
		System.out.println("---------------------------------");
		tencoIntArray.removeAll();
		tencoIntArray.printAll();
	}

}
