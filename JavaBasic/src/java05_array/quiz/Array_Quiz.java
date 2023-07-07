package java05_array.quiz;

import java.util.Scanner;

public class Array_Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
		 
		int n; // 인원수
		int p=12000; // 가격
		int sum1=0, sum2=0, sum3=0;
		int[] arr1, arr2;
		arr1 = new int[6]; // 길이 설정
		arr2 = new int[6];
		
		
		for (int i = 0; i < arr1.length-1; i++) {
			System.out.print((i+1) + "층의 사는 인원은 ? " );
			n = sc.nextInt();

			
			
	         System.out.println(n+"명");
	         sum1 += n; // 총 인원수
	         
	         arr1[i] = n; // arr1 배열값 설정
	         sum2 = p*n; // 한 층의 총 관리비

	         arr2[i] = sum2; /// arr2 배열값 설정
	         System.out.println((i+1)+ "층의 총 관리비 : " + sum2);
	         sum3 += sum2; // 총 금액
	         System.out.println("---------------------------");
	         
	      }
		
		
	      System.out.println("건물의 총 인원은 " + sum1 + " 명 입니다");
	      System.out.println("관리비의 총 금액은 " + sum3 +" 원 입니다");
	      System.out.println("---------------------------");
	      
	      for (int i = 0; i < arr1.length-1; i++) {
	          System.out.println(arr1[i]);
	          
	       }
	          arr1[5] = sum1;
	          System.out.println(arr1[5]);
	          System.out.println("---------------------------");
	          
	       for (int i = 0; i < arr1.length-1; i++) {
	          System.out.println(arr2[i]);
	          
	       }
	       arr2[5] = sum3;
	       System.out.println(arr2[5]);
	}
}