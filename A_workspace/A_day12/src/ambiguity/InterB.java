package ambiguity;

public interface InterB {
	
	void printHello();
	
	default void printBye() {
		System.out.println("Bye!");
	}
}
