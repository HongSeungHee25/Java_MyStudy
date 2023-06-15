package inheritance;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		ElectricCar electric = new ElectricCar();
		
		//자식 클래스에서 부모 메서드를 오버라이딩 하면
		//오버라이딩된 메서드가 실행된다
		electric.turnOn();
		electric.turnOff();
		
		Car car = new Car();
		//부모 객체는 자식 객체에 있는 멤버를 사용하지 못한다
//		System.out.println(car.currentCharge);
//		System.out.println(car.maxCharge);
	
		//객체명 instanceof 클래스명
		//해당 객체가 클래스 타입인지 확인한다
		
		System.out.println(car instanceof Car);
		System.out.println(car instanceof DieselCar);
		System.out.println(car instanceof Object);
		
		System.out.println(electric instanceof Car);
		System.out.println(electric instanceof ElectricCar);
		System.out.println(electric instanceof Object);
		
		//up casting
		//부모타입의 변수에 자식 객체의 주소값을 저장한다
		Car car2 = new ElectricCar();
		
		//부모 타입의 변수를 통해서는 상속받지 않은 자식 객체의
		//필드, 메서드를 사용하지 못한다
		//System.out.println(car2.maxCharge);
		
		//down casting
		//ElectricCar electric2 = new Car();
		ElectricCar electric3 = (ElectricCar)car2;
		
		System.out.println(electric3.maxCharge);
	}

}
