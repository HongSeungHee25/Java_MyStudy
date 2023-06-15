package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println(car.brand);
		System.out.println(car.color);
		
		car.turnOn();
		car.turnOff();
		
		//DieselCar 클래스에 별도의 메서드나 필드가
		//선언되어 있지 않아도 상속을 받았기 때문에 사용이 가능하다
		DieselCar diesel = new DieselCar();
		System.out.println(diesel.brand);
		System.out.println(diesel.color);
		
		diesel.turnOn();
		diesel.turnOff();
		
		DieselCar diesel2 = new DieselCar(0, null, null, false, 0, 0);
		
		diesel2.getCurrentOil();
	}

}
