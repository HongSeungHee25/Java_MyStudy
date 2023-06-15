package java1000;

public class S_23 {

	//자동차 클래스 구현하기
	//car 클래스는 다음과 같은 정보를 갖는다 >> 이름, 배기량, 크기
	//car 클래스는 다음과 같은 기능을 할 수 있다 >> 가속하기, 기어변경, 경적울리기
	
	public class Car{
		private String name; //이름
		private int displacement; //배기량
		private int size; //크기
		private int speed; //현재 속도
		private int gear; //현재 기어
		
		public Car(String name, int displacement, int size) {
			this.name = name;
			this.displacement = displacement;
			this.size = size;
			this.speed = 0;
			this.gear = 1;
		}
		
		public void accelerate() {
			speed += 10;
		}
		
		public void changeGear(int gear) {
			this.gear = gear;
		}
		
		public void honk() {
			System.out.println("빵빵");
		}
		
		public String getName() {
			return name;
		}
		
		public int getDisplacement() {
			return displacement;
		}
		
		public int getSize() {
			return size;
		}
		
		public int getSpeed() {
			return speed;
		}
		
		public int getGear() {
			return gear;
		}
	}

}
