package inheritance;

//占싸몌옙 클占쏙옙占쏙옙
public class Car {
	
	//field
	
	int seats;
	String color;
	String brand;
	boolean isSuv;
	
	//占십드를 占싱울옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌘듸옙占싹쇽옙 占쏙옙占쏙옙키 alt + shift + s + o
	
	public Car(int seats, String color, String brand, boolean isSuv) {
		super(); //object 클占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌘몌옙 호占쏙옙占싼댐옙
		this.seats = seats;
		this.color = color;
		this.brand = brand;
		this.isSuv = isSuv;
		System.out.println("占싸몌옙클占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙1 호占쏙옙!");
	}
	
	public Car() {
		super();
	}

	//method
	void turnOn() {
		System.out.println("占시듸옙占쏙옙 킵占싹댐옙");
	}
	void turnOff() {
		System.out.println("占시듸옙占쏙옙 占쏙옙占싹댐옙");
	}
}
