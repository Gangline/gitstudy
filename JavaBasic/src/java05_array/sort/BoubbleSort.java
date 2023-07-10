package java05_array.sort;

import java.util.Arrays;
import java.util.Collections;

public class BoubbleSort {
	public static void main(String[] args) {
		
		//버블 정렬
		int[] arr = { 3, 2, 5, 4, 1 };
		// index 번호를 앞에서부터 2개씩 묶어서 더 큰쪽을 오른쪽으로 보낸다
		//	-> 오름차순
		// index 번호를 앞에서부터 2개씩 묶어서 더 큰쪽을 왼쪽으로 보낸다
		//	-> 내림차순
		
		//---원본 출력---
		System.out.println("---정렬 전---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//---버블 정렬 수행 ---
//		for(int i=0; i<arr.length; i++) {
//			for(int j=1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[i];
//					System.out.println(arr[i]);
//				}
//			
//			}
//		}
		//전체 회차 반복
		for (int j=0; j<arr.length-1; j++) {	//j, 0 ~ 4
			
			//각 회차 반복
			for(int i=0; i<arr.length-1-j; i++) {	//i, 0 ~ 3 -j	
				
				//인접한 두 요소를 비교하고 왼쪽이 크면 스왑
				if( arr[i] > arr[i+1] ) {	//i+1, 1~4-j
					
					//스왑
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				
				}
				
			}
			//전체 데이터 출력 - 진행 중간 과정 확인
			System.out.println();
			System.out.print("TEST " + (j+1) + "회 ] ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				
			}
			System.out.println();
			
		}
		
		//---결과 출력---
		System.out.println("");
		System.out.println("---정렬 후---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
		System.out.println("-------------------------------------------");
		
		
		int[] arr2 = { 12, 23, 34, 45, 62, 345, 14325, 4243 };
		
		//정렬
		Arrays.sort(arr2);
		
		System.out.println( Arrays.toString (arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

