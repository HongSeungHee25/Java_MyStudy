package inter1;

//Laptop 인터페이스를 구현하는 MacBook 클래스 선언
public class MacBook implements Laptop{

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");
		System.out.println(Laptop.BOLT);
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}
	
	

}
