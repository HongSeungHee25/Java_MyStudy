package day07;

public class MethodTest2 {

	//실습1
	//두수의 합을 출력하는 기능(메서드)
	//메서드 이름 : sum
	
	//매개변수 : 2개 int num, int num1
	//실행할 코드 : System.out.println();

	void sum(int num,int num1) {
		System.out.println(num+num1);
	}
	
	//두수의 차를 반환하는 기능(메서드)
	//메서드 이름 : minus
	
	//매개변수 : 2개 int num, int num1
	//실행할 코드 : return num-num1
	//리턴타입(값) : int 
	
	int minus(int num, int num1) {
		//int result = num - num1;
		//return result;
		
		return num-num1;
	}
	
	//전달한 정수의 짝수 여부를 출력하는 기능(메서드) a - b
	//메서드 이름 : isEven
	//짝수 여부는 true, false로 출력한다
	
	//매개변수 : int num
	//실행할 코드 : 
	//리턴타입(값) : X
	
	void isEven(int num) {
		//풀이1
		if(num % 2 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		//풀이2
		System.out.println(num % 2 == 0);
	}
	
	//전달한 정수가 3의 배수인지를 반환하는 기능(메서드)
	//메서드 이름 : isThreeMultiple
	//배수 여부는 true, false로 반환한다
	
	//매개변수 : int num
	//실행할 코드 : 
	//리턴타입(값) : boolean
	
	boolean isThreeMultiple(int num) {
		return num % 3 == 0;
	}
	public static void main(String[] args) {

		//sum()
		//두수의 합계를 출력한다
		
		//System.out.println(num+num1);
		
		MethodTest2 mt = new MethodTest2();
		
		//두수의 합을 출력하는 메서드
		//int num2 = mt.sum(1, 2); sum 메서드는 반환값이 없기 떄문에 
		//값으로 볼수 없다
		mt.sum(1, 2);
		
		//두수의 차를 반환하는 메서드
		int num = mt.minus(2, 1);
		
		//정수의 짝수여부를 출력하는 메서드
		mt.isEven(30);
		
		//정수의 3의 배수 여부를 반환하는 메서드
		boolean result = mt.isThreeMultiple(30);
		
		
	}

}
