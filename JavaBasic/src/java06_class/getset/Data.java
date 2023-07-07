package java06_class.getset;


public class Data {

	
	private int num;		//이름
	private String name;	//이름
	private String phone;	// 전화번호
	
	//Setter 메소드
	//	-> 외부 객체의 호출에 의해 멤버필드 변수에 값을 대입하는 기능
	public void setNum(int num) {
		this.num = num;
	}
	
	//Getter 메소드
	//	-> 외부 객체의 호출에 의해 멤버필드 변수에 값을 반환하는(불러오는) 기능
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
//	롬복?롬북?
//	//Source -> getter and setter 들어가면 한번에 가능
	
}
