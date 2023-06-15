package abstractClass;

//abstract = 추상 클래스
public abstract class Person {

	//field
	String name;
	String gender;
	
	//method
	void eat() {
		System.out.println("냠냠");
	}
	void sleep() {
		System.out.println("쿨쿨");
	}
	
	//추상메서드 -> 구현이 되지 않은 메서드
	abstract void speak(); 
		
	
}
