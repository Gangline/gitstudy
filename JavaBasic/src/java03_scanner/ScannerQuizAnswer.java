package java03_scanner;

import java.util.Scanner;

public class ScannerQuizAnswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 객체
		//-------------------------------------------
		
		//이름 입력
		String name;
		System.out.print("Input Name : ");
		name = sc.nextLine();
		
//		System.out.println("[Test] name"  + name);
	
		//나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
//		System.out.println("[Test] Age"  + age);
		
		//성별 입력
		System.out.print("Input Gender : ");
//		sc.nextLine(); //버퍼 비우기
//		String gender = sc.nextLine();
//		System.out.println("[Test] gender : " + gender);
		
		//char 처리
		sc.nextLine(); //버퍼 비우기
		char gender = sc.nextLine().charAt(0);
		
//		System.out.println("[Test] gender : " + gender);
		
		
		//국어 입력
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		

		//영어 입력
		System.out.print("Input English : ");
		int eng = sc.nextInt();

		
		//수학 입력
		System.out.print("Input Methematics : ");
		int meth = sc.nextInt();

//		System.out.println("[Test] 점수 : " + kor +"," + eng + "," + meth);
		
		
		//총점 계산
		int sum = kor + eng + meth;
		
		//평균 계산
		double avg = sum / (double)3;
		

		//전체 출력
		System.out.println();
		System.out.println();
		
		System.out.println("---출력---");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(meth + "\t");
		System.out.print(sum + "\t");
		
//		System.out.println(avg);
		System.out.println(String.format("%.2f",avg));
		
//		System.out.printf("%.2f", avg);
//		System.out.println();
		
		
	}
}
