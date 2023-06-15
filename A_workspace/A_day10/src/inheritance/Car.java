package inheritance;

//부모 클래스
public class Car {
	
	//field
	
	int seats;
	String color;
	String brand;
	boolean isSuv;
	
	//필드를 이용한 생성자 자동완성 단축키 alt + shift + s + o
	
	public Car(int seats, String color, String brand, boolean isSuv) {
		super(); //object 클래스의 생성자를 호출한다
		this.seats = seats;
		this.color = color;
		this.brand = brand;
		this.isSuv = isSuv;
		System.out.println("부모클래스 생성자1 호출!");
	}
	
	public Car() {
		super();
	}

	//method
	void turnOn() {
		System.out.println("시동을 킵니다");
	}
	void turnOff() {
		System.out.println("시동을 끕니다");
	}
}
