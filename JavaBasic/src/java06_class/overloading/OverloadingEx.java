package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		System.out.println("---- display() ----");
		ol.display();
		
		ol.setX(44);
		ol.setY(56);
		
		// (44,55) 로 출력되도록 코드 작성
		System.out.println("----------------");
		ol.display();
		
		System.out.println("-");

		// x좌표, 111. y좌표 222로 입력하고 출력
		ol.display(111, 222);
		
		
	}
}
 