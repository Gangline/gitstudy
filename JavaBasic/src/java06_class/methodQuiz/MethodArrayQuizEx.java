package java06_class.methodQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		
		MethodArrayQuiz maq = new MethodArrayQuiz();
		
		int[] arr = {1,2,3,4,5};
		
		//1.배열의 모든 요소 10배
		//	원본의 arr의 값이 모두 10배가 됨
		maq.mul10(arr);		//arr은 mq 에 배열이 아니라 그냥 참조값, 변수
		
		//2.배열의 모든 요소 출력
		//	10, 20, 30, 40, 50 출력되어야 함
		maq.print(arr);
		
	}
}
