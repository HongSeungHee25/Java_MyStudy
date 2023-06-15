package inheritance;

public class CastingTest {

	//매개변수를 통해 전달된 객체가 
	//경유차 인지, 전기차 인지 확인하고 경유차라면 주유 메서드 사용
	//전기차라면 충전 메서드 사용
	void checkCar(Car car) {
		
		//상속받은 메서드를 자식 클래스에서 
		//오버라이딩(재정의) 해놨다면 up casting 된
		//상태에서 해당 메서드를 호출했을때 오버라이딩 된 메서드가 호출된다
		car.turnOn();
		
		//up casting된 상태에서 메서드를 호출하면
		//부모 클래스 메서드로 호출한다
		car.turnOff();
		
		
		
		if(car instanceof DieselCar) {
			System.out.println("경유차 입니다");
			//DieselCar 클래스의 getCurrentOil() 메서드 사용을 위해서
			//down casting 후에 메서드를 사용한다
			DieselCar diesel = (DieselCar)car;
			diesel.getCurrentOil();
			
			//down casting 먼저 하고 메서드 사용해라는 뜻
			((DieselCar) car).getCurrentOil();
		}
		else if(car instanceof ElectricCar)	{
			System.out.println("전기차 입니다");
			//ElectricCar 클래스의 getCurrentCharge() 메서드 사용을 위해서
			//down casting 후에 메서드를 사용한다
			ElectricCar electric = (ElectricCar)car;
			electric.getCurrentCharge();
			
			//down casting 먼저 하고 메서드 사용해라는 뜻
			((ElectricCar) car).getCurrentCharge();
		}
	}
	public static void main(String[] args) {
		
		//Car 부모
		//DieselCar 자식
		//ElectricCar 자식
		
		//up casting (자식 객체의 주소값을 부모 타입 변수에 저장한다)
		
		String name = "홍길동";
		System.out.println(name);
		System.out.println("홍길동");
		
		DieselCar diesel = new DieselCar();
		
		System.out.println(diesel);
		System.out.println(new DieselCar());
		
		//값 자체로 사용하는것
		Car car1 = new DieselCar();
		//변수에 담은 값을 사용하는것
		Car car2 = diesel;
		
		ElectricCar electric = new ElectricCar();
		
		//값 자체로 사용하는것
		Car car3 = new ElectricCar();
		//변수에 담은 값을 사용하는것
		Car car4 = electric;
		
		//down casting (up casting된 자식 객체를 자식 타입 변수에 저장한다)
		
		//부모 객체의 값을 자식 타입 변수에 넣는것이 절대 아님!
		//DieselCar diesel2 = new Car();
		
		//up casting 된 자식 객체를 자식 타입 변수에 저장한다
		DieselCar diesel3 = (DieselCar) car1;
		ElectricCar electric2 = (ElectricCar) car3;
		
		CastingTest ct = new CastingTest();
		
		//변수에 값을 담아 전달
		ct.checkCar(diesel);
		ct.checkCar(electric);
		
		//값 자체를 전달
		ct.checkCar(new DieselCar());
		ct.checkCar(new ElectricCar());
		
		
	}

}
