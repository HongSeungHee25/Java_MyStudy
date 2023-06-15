package inter1;

import javax.naming.directory.SchemaViolationException;

public class InterfaceTest {

	public static void main(String[] args) {

		//인터페이스는 객체화하지 못한다(객체를 생성하지 못한다)
		//Laptop laptop = new Laptop();
		
		MacBook macbook1 = new MacBook();
		
		macbook1.turnOff();
		macbook1.turnOn();
		
		//클래스명.필드명(변수명)
		System.out.println(MacBook.BOLT);
		System.out.println(MacBook.LANGUAGE);
		
		System.out.println(Laptop.BOLT);
		System.out.println(Laptop.LANGUAGE);
		
		//인터페이스를 구현하는 클래스는 해당 인터페이스의 타입을 가지게 된다
		System.out.println(macbook1 instanceof Laptop);
		
		//up casting
		Laptop laptop = new MacBook();
		
	}

}
