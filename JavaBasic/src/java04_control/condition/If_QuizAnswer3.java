package java04_control.condition;

import java.util.Scanner;

public class If_QuizAnswer3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력개체
		int num1; //입력값 변수
		int num2; //입력값 변수
		
		//숫자 두 개 입력받기
		System.out.print("Input Number : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number : ");
		num2 = sc.nextInt();
		
		if( num1 > num2 ) {	//num1이 큰 경우
			System.out.println(num1 + "이/가 츱니다");
		}
		
		if( num1 < num2 ) {	//num2이 큰 경우
			System.out.println(num2 + "이/가 츱니다");
		
		}
		
		if( num1 == num2 ) {	
			System.out.println("두 숫자가" + num1 + "(으)로 같다");
		
		}
	}
	
	
	
}
