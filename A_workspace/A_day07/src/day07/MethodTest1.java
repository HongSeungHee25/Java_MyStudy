package day07;

public class MethodTest1 {

	//메서드는 메서드 밖에서 선언한다
	
	//000님 안녕하세요 라고 출력하는 기능
	//실행할 코드 : Scanner , String 
	//Scanner sc = new Scanner(system.in);
	//String name = null;
	//system.out.println("이름을 입력하세요");
	//name = sc.next();
	//system.out.println(name + " 님 안녕하세요");
	
	//리턴타입 메서드명(자료형 매개변수명) {실행할 코드}
	
	void welcome(String name) {
		int num = 10;
		System.out.println(name + " 님 안녕하세요");
		//System.out.println(num2);
	}
	
	//hello 라고 출력하는 기능
	//실행할 코드 : system.out.println("hello");
	
	//메서드 이름 : printHello
	//리턴타입(값) : X
	//매개변수 : X
	
	void printHello() {
		System.out.println("hello");
	}
	
	//1부터 10까지의 합계를 반환하는 기능
	
	//실행할 코드 : 
	//int total = 0;
	//for(int i=1;i<=10;i++){
	//total +=i; }
	
	//메서드명: getTotal
	//리턴타입(값): int
	//매개변수: X
	
	int getTotal() {
		int total = 0;
		for(int i=1;i<=10;i++){
		total +=i; }
		return total;
	}
	
	//1부터 전달한 정수까지의 합계를 반환하는 기능
	
	//실행할 코드: 
	//int total = 0;
	//for(int i=1;i<=num;i++){
	//total +=i; }
	
	//메서드명: getTotalToNum
	//리턴타입(값): int
	//매개변수: 0
	
	int getTotalToNum(int num) {
		
		int total = 0;
		for(int i=1;i<=num;i++){
		total +=i; }
		return total;
	}
	public static void main(String[] args) {
		
		int num2 = 20;
		
		MethodTest1 mt = new MethodTest1();
		
		//메서드는 메서드 안에서 사용한다
		mt.welcome("홍길동");
		
		//welcome() 메서드 안에서 선언된
		//num 이라는 변수를 호출하지 못한다
		//System.out.println(num);
		
		mt.printHello();
		
		//매개변수에 값으로 전달
		mt.getTotalToNum(20);
		
		//매개변수에 변수를 통해 전달
		int num = 30;
		mt.getTotalToNum(num);
		
		//리턴값을 변수에 담아 사용
		int total = mt.getTotal();
		System.out.println(total);
		
		//리턴값 자체를 사용
		System.out.println(mt.getTotalToNum(10));
	}
}
