package ambiguity;

public interface InterA {

	//추상 메서드 선언
	void printHello();
	
	//구현된 메서드 선언
	default void printBye() {
		System.out.println("안녕!");
	}
}
