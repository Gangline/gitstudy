package java04_control.loop;

public class StarQuiz {
	public static void main(String[] args) {
		
		//반복문을 사용하여 다음 모양을 출력하는 프로그램 만들기
		
		//		  *
		//		 ***
		//		*****
		//	   *******
//		int s = 4;
//		
//		for(int i=1; i<=s; i++) {
//			System.out.println("1");
//		}for(int j=1; j<=s-1; j++) {
//			System.out.print("2");
//		}
//			for(int k=1; k<=7; k++) {
//			System.out.println("*");
//		}
//			System.out.println("*");
//		System.out.println("*");
		
//		String s = "*";
//		String t = s+s; 
//		int i=1;
//		for(int j=1; j<=7; j++) {
////			System.out.println(i*j);
//			System.out.println(s);
//		}
//		System.out.println(t);
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			
			for(int j=0; j<i+1; j++) { //j, 0 ~ i+1 , xi
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("--------------------------------------");
		
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			
			for(int j=0; j<5-i; j++) { //j, 0 ~ i+1 , xi
				System.out.print("*");
			}
			System.out.println();
	
		}	
	
		System.out.println("--------------------------------------");

	
		for(int i=0; i<4; i++) { //i, 0~4, x5
			
			for(int j=0; j<2*i+1; j++) { //j, 0 ~ i+1 , xi
				System.out.print("*");
			}
			System.out.println();
			
		}
	
		System.out.println("--------------------------------------");
	
		
		for(int i=0; i<4; i++) { //i, 0~4, x5
			
			for(int j=0; j<4-i; j++) { //j, 0 ~ i+1 , xi
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) { //j, 0 ~ i+1 , xi
				System.out.print("*");
		}	
	
			System.out.println();
	
		}
	
		System.out.println("--------------------------------------");
	
		final int LINE = 13;
		
		for(int i=0; i<LINE; i++) { 
			
			for(int j=0; j<LINE-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
		}	
	
			System.out.println();
	
		}
		
		
		
		
		
	}
	
}
