package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {
	public static void main(String[] args) {
		
		//입력 개체
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---입력---");
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		System.out.print("Input String : ");
//		sc.nextLine(); //버퍼 비우기, 버퍼에 남은 '\n' (개행문자)를 제거한다

//		sc.skip("[\\r\\n]+"); //입력 버퍼의 '\r', '\n'을 모두 제거한다
		String str = sc.nextLine(); 
		
		System.out.println();
		System.out.println("---출력---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		
		
		
		
		
		
	}
}