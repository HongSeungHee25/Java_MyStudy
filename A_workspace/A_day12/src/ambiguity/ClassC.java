package ambiguity;

public class ClassC implements InterA, InterB{

	@Override
	public void printHello() {
		System.out.println("재정의된 printHello method");
	}

	//default 메서드 중복으로 인해 구현 클래스에서 
	//둘중 하나를 재정의하도록 한다
	@Override
	public void printBye() {
		System.out.println("재정의된 printBye method");
	}

}
