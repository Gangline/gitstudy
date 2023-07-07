package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//Quiz, 2~9단 구구단 출력
		
		//	1. 바깥쪽 for문
		//		2~9단 반복
		
		//		i, 2~9, x8
		
		//	2. 안쪽 for문
		//		각 단수에 맞는 구구단 반복
		
		//		j, 1~9, x9
		
		
		//---------------------------------------------------------------
		
		//각 단 진행 반복
		for(int i=2; i<=9; i++) { // i, 2~9, x8
			
			//구구단 출력
			for(int j=1; j<=9; j++) { // j, 1~9 곱셈
				System.out.println(i + "x" + j + "=" + i*j );
			}
			System.out.println("----------------------");
		}
		
	}
}



