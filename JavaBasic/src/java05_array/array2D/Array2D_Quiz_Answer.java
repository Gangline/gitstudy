package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz_Answer {
	public static void main(String[] args) {
		
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
	      
		//-------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		
		int[][] score = new int[2][3]; 	//   2명의 학생들 3과목 점수
		int[] sum = new int[2];  		//   2명의 학생들 총점
		double[] avg = new double[2];	//   2명의 학생들 평균
		
		final String[] SUBJECT = { "국어", "영어", "수학" };
		
		//2명에 대한 3과목 점수 입력
		for(int i=0; i<score.length; i++) { //i번째 학생
			
			for(int j=0; j<score[i].length; j++) { //j번째 과목
				
				System.out.print( (i+1) + "번째 학생의 " + SUBJECT[j] + "점수는? ");
				score[i][j] = sc.nextInt();
				
			}

			System.out.println();
			
		}
		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.println("TEST" + i + "," + j + "]" + score[i][j]);
//			}
//		}
		
		//총점 계산하기
		for(int i=0; i<score.length; i++) { //i번째 학생
			
//			sum[i] = score[i][0] + score[i][1] + score[i][2];
			for(int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		
		}	
//			
//		for(int i=0; i<score.length; i++) { //i번째 학생
//			System.out.println("TEST ] " + sum[i]);
//		}
			
			
		//평균 계산하기
		for(int i=0; i<score.length; i++) { //i번째 학생
			avg[i] = sum[i]/(double)3;
//			System.out.println("TEST ] " + avg[i]);
		}
		
		
		
		//최종 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			
			//번호
			System.out.print( (i+1) + "\t");
			
			
			//3과목 점수
			for(int j=0; j<score[i].length; j++) {
				System.out.print( score[i][j] + "\t");
			}
//			//국어
//			System.out.println( score[i][0] + "\t");
//			
//			//영어
//			System.out.println( score[i][1] + "\t");
//			
//			//수학
//			System.out.println( score[i][2] + "\t");
			
			//총점
			System.out.print( sum[i] + "\t");
			
			//평균
			System.out.printf( "%.2f", avg[i] );
			System.out.println();
			
		}
		
	}
}
