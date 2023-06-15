package access1;

public class ClassA {

	//field
	//[접근 권한 제어자] 자료형 변수명
	int defaultData;
	public int publicData;
	protected int protectedData;
	private int privateData;
	
	
	
	//method
	//[접근 권한 제어자] 리턴타입 메서드명 .....
	void defaultMethod() {
		System.out.println("default method");
	}
	public void publicMethod(){
		System.out.println("public method");
	}
	protected void protectedMethod(){
		System.out.println("protected method");
	}
	private void privateMethod() {
		System.out.println("private method");
	}
	//getter(가져온다), setter(저장한다,수정한다)
	//get필드명, set필드명
	//단축키 alt + shift + s + r
	
	public int getPrivateData() {
		return privateData;
	}
	public void setPrivateData(int privateData) {
		this.privateData = privateData;
	}
	
	
}
