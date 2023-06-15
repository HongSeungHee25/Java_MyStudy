package abstractClass;

public class AbstractTest {
	
	void useSpeack(Person person) {
		person.speak();
	}

	public static void main(String[] args) {
		
		//Person 클래스의 객체를 생성할수 없다(객체화 할수 없다)
		//추상 클래스는 객체를 생성할수 없다(객체화 할수 없다)
		//Person person1 = new Person();
		
		Korean korean1 = new Korean();
		korean1.speak();
		
		American american1 = new American();
		american1.speak();
		
		System.out.println(korean1 instanceof Person);
		System.out.println(american1 instanceof Person);
		
		//up casting
		Person person2 = new Korean();
		Person person3 = new American();
		
		AbstractTest at = new AbstractTest();
		
		//추상 클래스의 추상 메서드는 자식 클래스에서
		//재정의(오버라이딩)하여 구현하여 사용한다
		at.useSpeack(person2);
		at.useSpeack(person3);
	}

}
