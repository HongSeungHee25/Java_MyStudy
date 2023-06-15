package day08;

public class StaticTest {

	public static void main(String[] args) {

		// 객체화 하지 않아도 사용할수 있다
		// 클래스명.필드명
		System.out.println(ClassA.staticData);
		
		//클래스명.메서드명
		ClassA.staticMethod();
		
		ClassA classA = new ClassA();
		System.out.println(classA.instanceData);
		
		classA.instanceMethod();
	}

}
