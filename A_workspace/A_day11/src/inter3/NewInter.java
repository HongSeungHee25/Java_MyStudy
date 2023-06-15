package inter3;

public interface NewInter {
	
	//추상 메서드(미구현 메서드)
	void methodA();
	
	//디폴트 메서드(구현된 메서드)
	default void methodB() {
		System.out.println("구현된 메서드");
		privateMethod();
	}
	
	//static 메서드
	static void staticMethod() {
		System.out.println("statlc 메서드");
	}
	
	//private 메서드(인터페이스의 다른 메서드에서 사용)
	private void privateMethod() {
		System.out.println("private 메서드");
	}
}
