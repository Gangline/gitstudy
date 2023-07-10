package java06_class.variable;

public class ClassVariable_01 {

	//멤버 필드 ()괄호 없고
	private int num = 9999;
	private String name = "Alice";
	
	public ClassVariable_01() {
		
	}
	
	//멤버 메소드 ()괄호 있고
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
