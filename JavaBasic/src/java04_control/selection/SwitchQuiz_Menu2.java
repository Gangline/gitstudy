package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu2 {
	public static void main(String[] args) {
		
	//   - 메뉴 만들기
		//
		//   ===============================
//		      M  e  n  u
		//   ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
		//   ===============================
		//
//		     >> _
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

		Scanner sc = new Scanner(System.in);
		
		int input;
		input = sc.nextInt();
		
		String str = sc.nextLine();
		String gen = sc.nextLine();
		String name = sc.nextLine();
		
		if(input == 1) {
			System.out.println("Hello World");
//		}else if (str == 2){
			
		}
		
		
	}
}
