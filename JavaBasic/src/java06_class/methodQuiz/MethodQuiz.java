package java06_class.methodQuiz;

public class MethodQuiz {

	//Q1. 1~100 출력 기능
	
	//Q2. 전달인자만큼 "Hello" 를 반복해서 출력하는 기능
	
	//Q3. 전달인자 숫자만큼, 전달인자 문자열을 출력하는 기능
	
	int i;
	public void nump() {
		for(i=0; i<100; i++ ) {
			System.out.println(i+1);
		}
	}
	
	public void nump2(int num) {
		for(i=0; i<num; i++) {
			System.out.println("Hello");
		}
	}

	public void nump3(int num, String data) {
		for(i=0; i<num; i++) {
			System.out.println(data);
		}
	}
	
}
