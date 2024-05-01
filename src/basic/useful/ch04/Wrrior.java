package basic.useful.ch04;

public class Wrrior {
	
		   
		   // 2. static 변수 활용 데이터 타입 선언
		   private static Wrrior wrrior;
		   
		   
		   // 1. 생성자에 접근제어 지시자를 private 로 변경하면
		   // 외부에서 생성자를 호출 할 수 없다.
		   private Wrrior() {}
		   
		   // 3. 외부에서 접근 가능한 메서드를 만들어 준다.
		   public static Wrrior getInstance() {
		      
		      if(wrrior == null) {
		    	  wrrior = new Wrrior();
		      }
		      return wrrior;
		   }
	
}
