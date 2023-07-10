package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {

	private Scanner input = new Scanner(System.in);
	private Student stu = new Student(); //디폴트 생성자
	public void StudentSecvice() {
//		stu = new Student(); //디폴트 생성자 코드 꼭 만들자
		
		
	}
	
	public void insertInfo() {	//이름 나이
		System.out.println("학생 정보");
		System.out.print("Input name : ");
		stu.setName(input.nextLine());
		System.out.print("Input Age : ");
		stu.setAge(input.nextInt());
		System.out.println();

	}
	
	public void insertScore() { //국영수 점수
		System.out.println("과목별 점수");
		
		System.out.print("국어 점수 : ");
		stu.setKor(input.nextInt());
		System.out.print("영어 점수 : ");
		stu.setEng(input.nextInt());
		System.out.print("수학 점수 : ");
		stu.setMath(input.nextInt());
		
		//메소드 호출
		calcSum();
		calcAvg();
	}
	
	private void calcSum() { //국영수 점수 합
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
		System.out.print("국,영,수 점수 합 : ");
		System.out.println(stu.getSum());
		
		
	}
	
	private void calcAvg() {	//평균
		System.out.print("세과목 평균 : ");
		stu.setAvg(stu.getSum() / (double)3);
		System.out.println(stu.getAvg());
	}
	
	public void printStu() { //학생 프린트
		System.out.println();
		System.out.println("이름" + "\t" + "나이" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");
		System.out.print(stu.getSum() + "\t");
		
		System.out.printf("%.2f " , stu.getAvg());
		
	}
}
