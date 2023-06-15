package abstractClass;

//추상 클래스를 상속받을때
//1. 자식 클래스에서 추상 메서드를 구현한다
//2. 자식 클래스도 추상 클래스로 선언한다
public class Korean extends Person {

	@Override
	void speak() {
		System.out.println("안녕하세요");
	}
	
}
