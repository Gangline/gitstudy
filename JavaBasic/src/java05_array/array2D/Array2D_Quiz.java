package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz {
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
		Scanner sc= new Scanner(System.in);
		
		int[][] sco = new int[2][3]; 					//i 행 (학생 수)
//			sco[0][0] = 학생 1의 국어점수
//			sco[0][1] = 학생 1의 영어점수
//			sco[0][2] = 학생 1의 수학점수

		
//			sco[1][0] = 학생 2의 국어점수
//			sco[1][1] = 학생 2의 영어점수
//			sco[1][2] = 학생 2의 수학점수
		String[] SUBJECT = { "국어", "영어", "수학" };
//			과목 이름
//		System.out.println("test" + SUBJECT.length);
		int[] total = new int[2];
//			total[0] = 학생 1의 총합
//			total[1] = 학생 2의 총합
		double[] avg = new double[2];
		//학생별 점수
//		System.out.println("test2 " + sco.length);
		for(int i=0; i<sco.length; i++) {	//length == 길이			//i 학생의 번호
			for(int j=0; j<sco[i].length; j++) {			//j 열 (과목)
				
				System.out.print("학생 " + (i+1) + "의 " + SUBJECT[j] +  " 점수는 : "); 
				sco[i][j]= sc.nextInt();
				total[i] += sco[i][j];
				avg[i] = total[i]/(double)sco[i].length;
			}
			System.out.println("TEST : " + total[i]);
			System.out.printf("%.2f",avg[i]);
			System.out.println();
			System.out.println();
					
				}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<sco.length; i++) {
			//번호
			System.out.print( (i+1) + "\t");
			
			for(int j=0; j<sco[i].length; j++) {
				System.out.print(sco[i][j] + "\t");
			}
			
//			//국어 점수
//			System.out.print(sco[i][0] + "\t");
//			
//			//영어 점수
//			System.out.print(sco[i][1] + "\t");
//			
//			//수학 점수
//			System.out.print(sco[i][2] + "\t");

			//총점
			System.out.print(total[i] + "\t");

			//평균
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
		
		
		
		
	} //class end
} //main end
