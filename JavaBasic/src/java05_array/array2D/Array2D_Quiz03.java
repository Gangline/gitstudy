package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz03 {
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
		String[] SUB = {"국어", "영어", "수학"};
		int sum;
		
		//학생들 점수
		int[][] score = new int[2][3];
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[i].length; j++) {
					
					System.out.print("학생" +  (i+1) + " 의 " + SUB[j] +  "점수는 : ");
					score[i][j] = sc.nextInt();
				}
				System.out.println();
				
			}
		
		//학생들 총점	
		int[] total = new int[2];	
			for(int i=0; i<score[i].length; i++) {
//				total[i] += score[i];
				System.out.println("total i " + total[i]);

			}
	} //class end
} //main end
