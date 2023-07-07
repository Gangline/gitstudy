package java04_control.condition;

import java.util.Scanner;

public class If_Quiz {
	public static void main(String[] args) {
		
//	    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//      >> Input Number : -3
//      >> 음수입니다
//
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input < 0 && input <= 0) {
		System.out.println("음수 입니다");
		}
		
		
		
//    + 입력한 데이터가 3의 배수인지 판별하시오
//     (% 연산자 사용)
//      >> Input Number : 7
//      >> 3의 배수가 아닙니다
		
		int input1 = sc.nextInt();
//		String.format("%d")
//		if(input1 == "%d");
		System.out.println("3의 배수가 아닙니다.");
//
//    + 두 수를 입력 받아 큰 수를 출력하시오
//      >> Input Number1 : 44
//      >> Input Number2 : 88
//      >> 88 이 더 큰 수

		
		
	}
}
