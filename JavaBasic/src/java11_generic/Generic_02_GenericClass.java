package java11_generic;


//제네릭 클래스
class Class02<T> {
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}





public class Generic_02_GenericClass {
	public static void main(String[] args) {

		//타입 파라미터를 결정하지 않음
		//	-> Object타입으로 자동 결정
		//	-> raw type
		Class02 c01 =new Class02();
		
		//12345, int -> Integer -> Object -> T, 타입 파라미터
		c01.setData(12345);
		
		int num = (int) c01.getData();
		
		//---------------------------------------------------------------------------------
		
		//T	-> String 결정
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		
		String fruit = c02.getData();
		System.out.println(fruit);
		
		
		
	}
}







