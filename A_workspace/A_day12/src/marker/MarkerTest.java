package marker;

public class MarkerTest {

	static void checkAnimal(Animal animal) {
		
		//해당 동물이 포유류 이면 달려갑니다 출력
		//해당 동물이 조류 이면 날아갑니다 출력
		
		//animal -> MammalMarker 인터페이스 구현 클래스의 인스턴스(객체)
		if(animal instanceof MammalMarker) {
			System.out.println("달려갑니다");
		}else if(animal instanceof BirdsMarker) {
			System.out.println("날아갑니다");
		}
	}
	public static void main(String[] args) {

		//매개변수 Animal animal 에게
		//자식 객체(new Dog())를 전달한다
		//부모타입 변수 = 자식 객체 주소값이 들어갔으니
		//up casting 이 이루어진다
		
		MarkerTest.checkAnimal(new Dog());
		checkAnimal(new Eagle());
		
	}

}
