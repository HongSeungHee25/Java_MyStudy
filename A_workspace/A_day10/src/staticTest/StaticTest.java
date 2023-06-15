package staticTest;

public class StaticTest {

	public static void main(String[] args) {
		
		//static field 사용 클래스명.필드명
		System.out.println(ClassA.staticData);
		
		//static method 사용 클래스명.메서드명
		ClassA.staticMethod();
		
		//instance field 사용
		ClassA classA = new ClassA();
		System.out.println(classA.instanceData);
		
		//instance method 사용
		classA.instanceMethod();
		
		//생성자 초기화 = 50
		//명시적 초기화 = 40
		//초기화 블럭 = 30
		
		ClassA classA2 = new ClassA(50);
		System.out.println(classA2.instanceData);
	}
}
