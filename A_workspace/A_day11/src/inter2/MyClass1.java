package inter2;

public class MyClass1 implements InterB {

	@Override
	public void methodA() {
		System.out.println("InterA의 추상메서드");	
	}

	@Override
	public void methodB() {
		System.out.println("InterB의 추상메서드");
	}

}
