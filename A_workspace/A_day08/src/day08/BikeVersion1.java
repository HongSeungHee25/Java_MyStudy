package day08;

public class BikeVersion1 {

	// field(필드)

	String color;
	int price;
	int wheel;
	String bell;

	// constructor(생성자)

	BikeVersion1() {
		// 직접 선언하지 않아도 자동으로 선언된다
		// 만약 생성자를 직접 선언하면 매개변수가 없는 기본 형태의
		// 생성자를 자동으로 선언해주지 않는다
		// 필드의 자료형에 해당하는 기본값으로 초기화 한다
		System.out.println("생성자1 호출");
	}

	// BikeVersion1(String c){
	// 메서드 오버로딩 생성자 오버로딩
	// color = c;
	// System.out.println("생성자2 호출");
	// return 1; 생성자는 리턴값이 존재하지 않는다
	// }

	BikeVersion1(String color) {
		// 메서드 오버로딩 생성자 오버로딩
		this.color = color;
		System.out.println("생성자2 호출");

	}
	public BikeVersion1(int price) {
		this.price = price;
	}

	//생성자 자동 완성 단축키
	//ctrl + space : 매개변수가 없는 형태의 생성자(기본 생성자를 만들기 전)
	//alt + shift + s + o : 생성자 오버로딩
	
	// method(메서드)

	void move() {
		System.out.println("자전거를 움직입니다");
	}

	void stop() {
		System.out.println("자전거를 멈춥니다");
	}

}
