package java09_api;

import java.util.Random;
import java.util.Scanner;

public class UpDown2 {
	public static void main(String[] args) {
		
		int com;	//컴퓨터의 숫자 (랜덤)
		int user;	//사용자의 숫자 (키보드 입력)
		
		Random ran = new Random(); //랜덤 객체
		Scanner sc = new Scanner(System.in); //키보드 입력 객체
		
		System.out.println("====================Start==================");
		
		com = ran.nextInt(50) + 1;	//컴퓨터의 랜덤 숫자 생성, 1~50
//		System.out.println("[TEST] " + com);
		
		
		for(int count=0; count<7; count++) {
			
			//사용자의 입력
			while ( true ) {
				
				System.out.print("1~50 중 하나 입력 : ");
				user = sc.nextInt();
				
				if( user >=1 && user <= 50 ) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~50 범위의 숫자만 입력하세요!");
				}
			
			}
					
			//컴퓨터 랜덤 숫자(com)와 사용자(user) 입력 숫자 비교
			if(com > user) {//컴퓨터가 클 경우	-> UP
				System.out.println("UP");
			} else if ( com < user) {//컴퓨터가 작을 경우 -> Down
				System.out.println("Down");
			} else {//같을 경우 - 사용자 승리
				System.out.println("user 승리");
				
				//프로그램(메소드) 중단 코드
				return;
			
			}
			
			//	-> 컴퓨터가 클 경우	-> UP
			//	-> 컴퓨터가 작을 경우 -> Down
			//	-> 같을 경우 - 사용자 승리
			
		}
		
		System.out.println("user 패배");
		System.out.println("컴퓨터는 [" + com + "] 입니다");
		
		
		
	}
}
