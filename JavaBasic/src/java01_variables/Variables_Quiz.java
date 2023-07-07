package java01_variables;

public class Variables_Quiz {

	public static void main(String[] args) {
		
		String name = "Alice"; //문자 나열로 인한 String
		int age = 99; //정수 사용으로 인한 int
		char gender = '남'; //캐릭터 (하나의 개체)
		double tall = 222.66; //소수 사용우로 인한 double
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + tall);
		
		System.out.println("------------------------------------");
		
		
		// **필요한 데이터 -> 변수
		// 이름, 나이, 성별, 키
		
		// 1. 변수에 알맞을 타입 고르기
		
		// 이름		- 문자열	(String)
		// 나이		- 정수		(int)
		// 성별		- 단일 문자, 문자열		(char, String)
		// 키		- 소수		(double)
		
		
		// 2. 변수 선언
		String name1; //이름
		int age1; //나이
		char gender1; //성별
		double height; //키
		
		
		// 3. 대입
		name1 = "Apple";
		age1 = 23;
		gender1 = '남';
		height = 134.5;		
				
		// 4. 출력
		System.out.println("이름 : " + name1 );
		System.out.println("나이 : " + age1 );				
		System.out.println("성별 : " + gender1 );
		System.out.println("키 : " + height );
		
		System.out.println("-----------------------------");
		
		System.out.println("이름 : " + name1   + "\n나이 : " + age1 + "\n성별 : " + gender1 + "\n키 : " + height );
		
		
		System.out.println("-----------------------------");
		
		System.out.print("A");
		System.out.println("B");
		//ln은 라인의 약자로 줄바꿈을 한다. ln을 안하면 줄바꿈이 없다.
		
		System.out.println("-----------------------------");
		
		System.out.println("이름 : " + name1   + ", 나이 : " + age1 + ", 성별 : " + gender1 + ", 키 : " + height );
		
		System.out.print("이름 : " + name1 );
		System.out.print(", 나이 : " + age1 );				
		System.out.print(", 성별 : " + gender1 );
		System.out.println(", 키 : " + height );
		
		
		System.out.println("-----------------------------");
		
		System.out.println("HI HELLO HOLA");
		
		System.out.println("HI\nHELLO\nHOLA");
		
		//**	'\n' 글자는 두개지만 char타입으로 글자 하나로 인식. 줄바꿈 문자, 개행문자 를 의미한다
		//		( ASCII 10 - LF, Line Feed, 줄 먹이기 )
		
		System.out.println("-----------------------------");

		System.out.print("Apple\n");
		System.out.println("Apple");
		
		System.out.print("Apple");
		System.out.print("\n");
	
		System.out.print("Apple");
		System.out.println(); //줄바꿈 수행
		// 다 같은 명령어로 수행된다
		
		System.out.println("-----------------------------");

		
		
		
		
		
		
	}
}
