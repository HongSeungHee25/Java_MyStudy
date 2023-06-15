package inter1;

public interface Laptop {
	
	//상수
	//인터페이스는 생성자가 존재하지 않으므로
	//명시적 초기화를 통해서 초기화한다
	int BOLT=220;
	
	public static final String LANGUAGE="korean";
	
	//추상 메서드
	
	void turnOff();
	
	public abstract void turnOn();
}
