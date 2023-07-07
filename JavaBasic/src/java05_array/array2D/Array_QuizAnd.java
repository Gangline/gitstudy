package java05_array.array2D;

public class Array_QuizAnd {
	public static void main(String[] args) {
		
		
//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 배열이 선언된 뒤 문제를 푸시오
//
//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//
//		 - arr 배열의
//		  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//		  구하시오
//		  	=> -5
//
//
//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		  rank_arr라는 배열에 순위를 입력하시오
//		 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//		//Boublesort 사용 ********************
//
//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		 	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//		 	
//		 	출력한다면 (정렬도 할 수 있으면 해도 됨)
//		 	=> over_arr : 9, 10
//		 	=> ret_arr : 3, 8, 13, 17, 21, 27
		
		
		//-----------------------------------------
//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 배열이 선언된 뒤 문제를 푸시오
		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		// int[] arr;
		// arr = new int[10]
		// arr[0] = 10	짝
		// arr[1] = 17	홀
		// arr[2] = 3	짝
		// arr[3] = 9	홀
		// arr[4] = 27	짝
		// arr[5] = 10	홀
		// arr[6] = 8	짝
		// arr[7] = 9	홀
		// arr[8] = 13	짝
		// arr[9] = 21	홀
//		int sum = arr[0] + arr[2] + arr[4] + arr[6] + arr[8];
//		int sum1 = arr[1] + arr[3] + arr[5] + arr[7] + arr[9];
//		System.out.println(sum - sum1);
		
		System.out.println("---------------------------------");
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<arr.length; i++) {// 짝수번째 인덱스의 나열
			if(i%2==0) {
				sum += arr[i];
			} else {
				sum1 += arr[i];
			}
		}	System.out.println( sum - sum1);
			
			
//			for(int j=1; j<arr.length; j+=2) {// 짝수번째 인덱스의 나열
//				sum1 = arr[j];
//				System.out.println(sum1);
//			}
//		}
		
//		System.out.println("---------------------------------");


		
		
	}
}
