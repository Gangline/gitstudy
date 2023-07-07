package java01_variables;

public class Variables_06 {

	public static void main(String[] args) {
		
		//리터럴
		System.out.println( 5436L ); 	//long형 리터럴 상수
		
		System.out.println( 6.2345f ); 	//float형 리터럴 상수
	
		
		//------------------------------------------------------
		
		//변수 
		int num;
		num = 123;
		num = 424;
		num = 234;
		

		//------------------------------------------------------

		//변수의 상수화
		//이름있는 상수

		//**이름있는 상수의 식별값은 모든 글자를 대문자로 작성한다
		final int MAX; //최대값
		
		MAX = 199;
		
		 //에러 -> 상소화된 변수는 값 대입을 한 번만 수행할 수 있다
//		max = 200;	
		

		//------------------------------------------------------

		//선택영역 대문자로 변환 : ctrl + shift + x
		//선택영역 소문자로 변환 : ctrl + shift + y
		
		final int WORKING_DAY = 20; //근무일 수
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다");
		
		// + 기호 : 문자열 연결 기호
		
		System.out.println("이번 달 급여 : " + WORKING_DAY * 150000 + "원 입니다");

		String commaAdded = String.format("%,d", 3000000);				
		System.out.println( commaAdded );
		
		System.out.println("----------------------------");		
	
		String commaPay = String.format("%,d", WORKING_DAY * 150000 );
		
		System.out.println( "이번달 급여는 : " + commaPay + "원 입니다.");
	
	
	
	}
}










