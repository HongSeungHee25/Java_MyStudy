package cooperation;

public class Bus {
	int busNumber; //버스번호
	int passengerCount; //승객 수
	int money; //돈
	
	public Bus(int busNumber) {
		//모든 버스는 번호를 가져야한다.(기본 생성자 설정)
		this.busNumber = busNumber;
	}
	public void take(int money) {
		//승객을 태움
		passengerCount++;
		this.money+=money;
		//위의 매개변수를 받았으므로, 받은 만큼 돈이 증가해야 하므로 +=money로 설정한다.
	}
	public void showinfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 버스 수입은 "+money+"원 입니다.");
	}
}
