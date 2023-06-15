package java1000;

public class S_25 {
	
	//고양이 클래스 구현하기
	//Cat 클래스는 다음과 같은 정보를 갖는다 >> 이름, 색깔, 호기심
	//Cat 클래스는 다음과 같은 기능을 할 수 있다 >> 좁은곳 파고들기, 털 곤두 세우기, 미야옹 울기
	
	static class Cat{
		String name; //이름
		String color; //색깔
		int curiosity; //호기심
		
		public Cat(String name, String color, int curiosity) {
			this.name = name;
			this.color = color;
			this.curiosity = curiosity;
		}
		
		public void digUntoNarrowPlace() {
			System.out.println(name+"이(가) 좁은 곳을 파고들었습니다.");
		}
		
		public void standHair() {
			System.out.println(name+"이(가) 털을 곤두세웠습니다.");
		}
		
		public void meow() {
			System.out.println("미야옹");
		}
	}
	public static void main(String[] args) {
		//Cat 인스턴스 생성하기
		Cat myCat = new Cat("제리","이쁜색",7);
		
		//Cat의 기능 사용하기
		myCat.digUntoNarrowPlace();
		myCat.standHair();
		myCat.meow();
	}
}
