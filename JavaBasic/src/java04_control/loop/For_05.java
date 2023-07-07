package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		
		//반복횟수 : 10번
		//반복구간 : 1~10
		
		//초기식 : int i=1; 
		//조건식 : i>=10;
		//증감식 : i++
//		int i;
//		for( i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//			System.out.println(i);
		
//		int i=0;
//		int sum = i+1;
//		
//		for(i=0; i<=10; i++);
//		System.out.println(i);
//		System.out.println("-------------------");
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
//
		
		//반복 횟수 : x10
		//반복 구간 : 1~10
		
//		for(i=sum; i<=sum+10; ) {
//			
//		}
//		
//		System.out.println("총합 : " + sum);

		   int sum = 0;
//		      for (int i = 0; i <= 10; i++) {
//		          sum += i;
//		      }
//		      System.out.println("합계: " + sum);
		
		 //------------------------------------------
		
		for(int i=0; i<10; i++) { //i, x10, 0~9
			sum = sum + (i+1);
		}
		System.out.println("총합 : " + sum);
		      
	}
}
