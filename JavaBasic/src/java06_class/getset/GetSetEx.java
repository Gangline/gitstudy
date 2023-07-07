package java06_class.getset;

public class GetSetEx {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		//에러, 외부 객체의 접근이 막혀있다
//		data.num = 123;
//		System.out.println(data.name);
				
		//------------------------------------------------------
		
		//Setter 호출
		data.setNum(111);

		//Getter 호출
		System.out.println(data.getNum());
		
		//------------------------------------------------------

		data.setName("Alice");
		System.out.println( data.getName());
		
	}
}
