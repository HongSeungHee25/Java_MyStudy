package day20;

public class FirstClass {
	public static void main(String[] args) {
		//자료형 변수=객체값;
		//클래스명 참조변수=new 클래스명();
		ClassA ca=new ClassA();
		ca.x=30;
		System.out.println(ca.x);
		ca.f1();

	}

}



class ClassA{
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
	
	
	
}