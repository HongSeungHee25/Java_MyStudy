package access2;

import access1.ClassA;

public class AccessTest2 extends ClassA{

	public static void main(String[] args) {
		
		//다른 패키지에 있는 클래스를 사용하기 위해 import 한다
		ClassA classA = new ClassA();
		
		//default 는 다른 패키지에서 접근 불가
//		System.out.println(classA.defaultData);
		System.out.println(classA.publicData);
		//protected 는 다른 패키지에서 접근 불가. 그러나 자식클래스는 가능
		//자식 클래스에서 사용
//		System.out.println(classA.protectedData);
		//private 은 다른 클래스에서 접근 불가
//		System.out.println(classA.privateData);
		
		
		//default 는 다른 패키지에서 접근 불가
//		classA.defaultMethod();
		classA.publicMethod();
		//protected 는 다른 패키지에서 접근 불가. 그러나 자식클래스는 가능
		//자식 클래스에서 사용
//		classA.protectedMethod();
		//private 은 다른 클래스에서 접근 불가
//		classA.privateMethod();
		
		AccessTest2 at = new AccessTest2();
		System.out.println(at.protectedData);
		at.protectedMethod();
	}

}
