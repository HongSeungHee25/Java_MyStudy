package day04;

public class IfTest {

	public static void main(String[] args) {
		
		
		//if문
		
		int num = 4;
		//조건식이 참일 경우에 작성한 코드를 실행한다
		if(num == 5) {
			System.out.println("일치합니다");
		}
		System.out.println("hello");
		
		boolean bool = true;
		
		if(bool) {
			System.out.println("bool 의 값이 참일경우 실행하는 문장");
		}
		
		if(bool == false) {
			System.out.println("bool 의 값이 거잣알 경우 실행하는 문장");
		}
		
		if(!bool) {
			System.out.println("bool 의 값이 거짓이 참이라면 실행하는 문장");
		}
		
		//if-else문
		
		if(num==0) {
			System.out.println("0 입니다");
		}else if(num>0) {
			System.out.println("양수 입니다");
		}else {
			System.out.println("음수 입니다");
		}
		
		int num2=100;
		
		if(num2==100) {
			System.out.println("100 입니다");
		}else if(num2==1000) {
			System.out.println("1000입니다");
		}else {
			System.out.println("둘다 아닙니다");
		}
		
		
	}

}
