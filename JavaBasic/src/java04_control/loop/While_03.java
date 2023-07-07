package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		
		//while문을 이용한 구구단 출력
		//	2~9단 전부 출력
		
//	for(int i=2; i<=9; i++) { // i, 2~9, x8
//			
//			//구구단 출력
//			for(int j=1; j<=9; j++) { // j, 1~9 곱셈
//				System.out.println(i + "x" + j + "=" + i*j );
//			}
//			System.out.println("----------------------");
			
			
		int i = 2;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.println(i + "x" + j + "=" + (i*j) );
				j++;
			}
			
			System.out.println("----------------------");
			i++;
		}
	}
}	
