package ambiguity;

public class AmbiguityTest {

	public static void main(String[] args) {
		
		//1. 두개의 인터페이스 내에 같은 이름, 매개변수, 리턴타입
		//즉 선언부가 같은 메서드가 선언되어 있다
		
		//InterA : void printHello();
		//InterB : void printHello();
		
		ClassC classC = new ClassC();
		classC.printHello();
		
		//2. 두개의 인터페이스 내에 선언부가 같은 default 메서드가 
		//선언되어 있다
		classC.printBye();
		
		//3. 부모 클래스의 메서드와 인터페이스의 default 메서드가 
		//선언부가 같다(같은 이름, 매개변수, 리턴타입)
		
		//부모 클래스의 메서드가 사용된다
		ClassD classD = new ClassD();
		classD.methodD();
		
		
		
		
	}

}
