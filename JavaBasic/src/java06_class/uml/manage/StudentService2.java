//package java06_class.uml.manage;
//
//import java.util.Scanner;
//
//public class StudentService2 {
//
//	private Scanner input = new Scanner(System.in);
//	private Student stu = new Student(); //디폴트 생성자
//	public void StudentSecvice() {
////		stu = new Student(); //디폴트 생성자 코드 꼭 만들자
//		
//		
//	}
//	
//	public void insertInfo() {	//이름 나이
//		System.out.print("Input Name : ");
//		stu.setName(input.nextLine());
//		System.out.print("Input Age : ");
//		stu.setAge(input.nextInt());
//		
//		
//	}
//	
//	public void insertScore() { //국영수 점수
//		
//		System.out.print("Input Korean : ");
//		stu.setKor(input.nextInt());
//	
//		System.out.print("Input English : ");
//		stu.setEng(input.nextInt());
//		
//		System.out.print("Input Math : ");
//		stu.setMath(input.nextInt());
//		
//		//총점 계산
//	}
//	private void calcSum() {
//		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
//	}
//	
//	//평균 계산
//	private void calcAvg() {
//		stu.setAvg(stu.getSum() / (double)3);
//	}
//	
////	public void calcSum() { //국영수 점수 합
////		
////	}
////	
////	public void calcAvg() {	//평균
////		
////	}
//	
//	public void printStu() { //학생 프린트
//		
//		System.out.println();
//		System.out.println("- - - - - 학생 정보 - - - - -");
//		
//		System.out.println("이름\t나이\t국어\t영어\t수학");
//		
//		System.out.print(stu.getName() + "\t" );
//		System.out.print(stu.getAge() + "\t" );
//		System.out.print(stu.getKor() + "\t" );
//		System.out.print(stu.getEng() + "\t" );
//		System.out.print(stu.getMath() + "\t" );
//		System.out.printf( "%.2f", stu.getAvg());
//		System.out.println();
//		
//		
//		
//		
//	}
//}
