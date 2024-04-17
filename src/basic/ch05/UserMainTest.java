package basic.ch05;

import java.net.MulticastSocket;

public class UserMainTest {

	public static void main(String[] args) {
		
		User userName1 = new User();
		User userName2 = new User();
		
		userName1.name = "김성후";
	    userName1.grade = 3;
	    userName1.major = "뮤지컬";
	    
	    System.out.println(userName1.name);
	    System.out.println(userName1.grade + ("학년"));
	    System.out.println(userName1.major + ("학과"));

	    System.out.println("--------------------------");
	    userName1.name = "배병호";
	    userName1.grade = 1;
	    userName1.major = "경찰행정";
	    
	    System.out.println(userName1.name);
	    System.out.println(userName1.grade + ("학년"));
	    System.out.println(userName1.major + ("학과"));
	    
		

	}//end of main

}//end of class
