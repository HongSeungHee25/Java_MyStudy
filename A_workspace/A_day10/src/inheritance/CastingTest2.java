package inheritance;

public class CastingTest2 {
	
	void getCar(Car usercar) {
		
		usercar.turnOff();
		
		//경유차, 전기차인지 확인한다
		
		if(usercar instanceof DieselCar) {
			DieselCar diesel = (DieselCar)usercar;
			diesel.getOil();
		}else if(usercar instanceof ElectricCar) {
			ElectricCar electric = (ElectricCar)usercar;
			electric.getCharge();
		}
	}

	public static void main(String[] args) {

		//실습1.
		
		//getCar 메서드 선언
		
		//경우차라면 시동을 크고 turnOff() 주유 getOil()
		//전기차라면 시동을 크고 turnOff() 충전 getCharge()
		
		//DieselCar 클래스 getOil() 메서드 : 주유 시작합니다 출력
		//ElectricCar 클래스 getCharge() 메서드 : 충전 시작합니다 출력
		
		CastingTest2 ct = new CastingTest2();
		
		ct.getCar(new DieselCar());
		ct.getCar(new ElectricCar());
		
	}

}
