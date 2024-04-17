package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	public static void main(String[] args) {
		// 당신은 학교의 IT 부서에서 근무하고 있으며,
		// 성적을 입력받아 학점을 알려주는 자바 프로그램을 개발하는 임무를 맡았습니다.
		// 프로그램은 사용자로부터 0부터 100까지의 성적을 입력받아야 하며,
		// 다음과 같은 기준으로 학점을 계산하여 결과를 출력해야 합니다.
		
		//- 90점 이상 100점 이하: 'A' 학점
		//- 80점 이상 90점 미만: 'B' 학점
		//- 70점 이상 80점 미만: 'C' 학점
		//- 60점 이상 70점 미만: 'D' 학점
		//- 60점 미만: 'F' 학점 (불합격)
		//- 입력받은 점수가 0 미만이거나 100을 초과하는 경우, "잘못된 입력입니다. 
		//성적은 0에서 100 사이로 입력해주세요."라고 안내하고 프로그램을 종료합니다.
		//- 각 학점별로 다음과 같은 추가적인 메시지를 사용자에게 제공해야 합니다.
		
		//요구사항
		//1. 사용자로부터 성적을 입력받기 위해 Scanner 클래스를 사용하세요.
		//2. 입력 받은 성적을 기반으로 학점을 계산하고, 
		//   해당하는 메시지를 출력하세요.
		//3. 모든 입력과 계산, 출력은 main 메소드 내에서 이루어져야 합니다.
		//4. 입력 받은 성적이 범위를 벗어날 경우, 
		//   적절한 안내 메시지를 출력하고 프로그램을 종료하세요.
		System.out.println("성적을 입력하세요 (0-100): ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        
        
        char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
        String message = ""; // 추가적인 피드백 메시지
        //message = 문자열을 담을수있다

        if (score > 100 || score < 0) {
        	System.out.println("잘못된 입력 입니다.");
        }
        else if (score >= 100 || score >= 90) {
        	System.out.println('A');
        }else if(score >= 90 || score >= 80) {
        	System.out.println('B');
        }else if(score >= 80 || score >= 70) {
        	System.out.println('C');
        }else if(score >= 70 || score >= 60) {
        	System.out.println('D');
        }else if(score < 60) {
        	System.out.println("불합격 : " + 'F');
        }else {
        	System.out.println("잘못된 입력 입니다.");
        }
        
        // .. 코드를 작성해주세요 
        // 힌트 - 비교 연산자와 논리연사자를 활용 
        // ...
        
        scanner.close(); // 자원 닫기 
	}// end of main

}// end of class
