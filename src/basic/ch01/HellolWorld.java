package basic.ch01;

//<-주석, 한줄 주석(컴파일러가 무시하는 영역 입니다)
public class HellolWorld {
	public static void main(String[] args) {
	//화면 또는 콘솔창에 출력하라
	System.out.println("Hello World");
	
	System.out.println(); //출력 후 다음줄로 넘어가는 역활을 합니다.
	// 숫자 0부터 9까지 화면에 하나씩 출력 하시오.
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	
	//우리 일상에서는 10진수라는 개념을 많이 사용하고있습니다.
	//10진수란 뭘까?
	//0~9까지 사용하는 수를 말한다.
	//10<--단위 1을 올리고 0부터 다시 시작하는 개념이다.
	
	//그럼 이진수란
	//0과 1로만 이루어진 숫자 체계이다.
	//2진수로 2를 표현한다면
	//1->2-> 단위 1을 올린다
	//2진수로 3을 표현한다면
	//1-->10-->11(십진수 3이다)
	System.out.println("코드를 수정");
} // end of main

}// end of class