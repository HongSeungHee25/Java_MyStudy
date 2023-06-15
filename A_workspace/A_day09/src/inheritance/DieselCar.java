package inheritance;

//자식 클래스
public class DieselCar extends Car{
	
	//field
	
	int maxOil;
	int currentOil;
	
	//constructor
	public DieselCar() {
	}
	
	public DieselCar(int seats, String color, String brand, boolean isSuv) {
		super(seats, color, brand, isSuv);
	}


	public DieselCar(int seats, String color, String brand, boolean isSuv, int maxOil, int currentOil) {
		//매개변수 형태에 맞는 부모 생성자를 호출한다
		//생성자 제일 첫줄에 작성한다
		super(seats, color, brand, isSuv);
		this.maxOil = maxOil;
		this.currentOil = currentOil;
		System.out.println("자식클래스 생성자1 호출!");
	}
	//method
	
	void getCurrentOil() {
		int age = 10;
		System.out.println("현재 주유량 = "+currentOil);//같은 클래스영역에 필드는 사용가능
	}
	void methodA() {
		//System.out.println(age);
	}
	//메서드 오버라이딩 = 코드를 재정의 
	//메서드 오버라이딩 단축키 alt + shift + s + v
	@Override
	void turnOn() {
		System.out.println("경유차 시동을 킵니다");
	}

	@Override
	void turnOff() {
		System.out.println("부릉부릉 추가~!");
		super.turnOff();
	}
	
}
