package access1;

public class AccessTest1 {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		
		System.out.println(classA.defaultData);
		System.out.println(classA.publicData);
		System.out.println(classA.protectedData);
		//private 은 다른 클래스에서 접근 불가
//		System.out.println(classA.privateData);
		
		
		classA.defaultMethod();
		classA.publicMethod();
		classA.protectedMethod();
		//private 은 다른 클래스에서 접근 불가
//		classA.privateMethod();
	}

}
