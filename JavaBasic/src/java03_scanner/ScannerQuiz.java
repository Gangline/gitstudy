package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	//입력 객체
		
		
			
		 //학생 정보 관리 프로그램
		   
		   //   이름, 나이, 성별, 국어, 영어, 수학
		  
		  
		   //   6가지 정보를 저장할 수 있는 변수를 만들고
		   
		   //   총점과 평균을 포함한 결과를 출력한다
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		//Input Gender : F
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//이름   나이   성별   국어   영어   수학   총점   평균
		//Alice   33      F      100      99      97      296      98.666666667
		
		System.out.println("---입력---");
		//이름 입력
		System.out.print("Input Name : ");
		String name = sc.nextLine();
//		System.out.println("[Test] name : " + name);
		
		//나이 입력
		System.out.print("Input Age: ");
		int age = sc.nextInt();
//		System.out.println("[Test] age : " + age);
		
		//성별 입력
		System.out.print("Input Gender : ");
		sc.nextLine();
		char gen = sc.nextLine().charAt(0);
//		System.out.println("[Test] gen : " + gen);
		
		//국어 점수
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
//		System.out.println("[Test] kor : " + kor );
		
		//영어 점수
		System.out.print("Input English : ");
		int eng = sc.nextInt();
//		System.out.println("[Test] eng : " + eng);
		
		//수학 점수
		System.out.print("Input Methematics : ");
		int meth = sc.nextInt();
//		System.out.println("[Test] meth : " + meth);
		
		//총점 계산
		int sum = (kor + eng + meth);
		double avg = (sum /(double)3);
//		System.out.print("Total : " + sum);
//		System.out.println("Average : " + avg);
		
		System.out.println("---출력---");
		
		
		System.out.println("이름\t나이\t성별\t한국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gen + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(meth + "\t");
		System.out.print(sum + "\t");
//		System.out.print(avg);
		
		System.out.printf("%.2f", avg);
		System.out.println();
		
		
		
	}
}
