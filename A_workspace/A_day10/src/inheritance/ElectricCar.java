package inheritance;

//자식 클래스
public class ElectricCar extends Car{//extends 상속받을 클래스 이름
	
	//field
	
	int maxCharge;
	int currentChatge;
	
	//constructor
	public ElectricCar() {
	}
	
	public ElectricCar(int seats, String color, String brand, boolean isSuv) {
		super(seats, color, brand, isSuv);
	}

	public ElectricCar(int seats, String color, String brand, boolean isSuv, int maxCharge, int currentChatge) {
		super(seats, color, brand, isSuv);
		this.maxCharge = maxCharge;
		this.currentChatge = currentChatge;
	}
	//method
	
	void getCurrentCharge() {
		System.out.println("현재 충전량 = "+currentChatge);
	}
	//turnOn() 메서드 오버라이딩 전기차의 시동을 킵니다 출력
	//turnOff() 메서드 오버라이딩 전기차의 시동을 끕니다 출력

	@Override
	void turnOn() {
		System.out.println("전기차의 시동을 킵니다");	
	}

	@Override
	void turnOff() {
		System.out.println("전기차의 시동을 끕니다");
		}
	void getCharge() {
		System.out.println("충전을 시작합니다");
	}
	
	
}
