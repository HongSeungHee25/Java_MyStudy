package exceptionTest;

import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {

		//throw : 예외 발생시키기
		
//		int num = 0;
//		
//		//위의 코드는 아래의 예외 상황이 발생할수 있는 코드가 아님에도 
//		//불구하고 예외 상황이 발생한다
//		
//		//throw new 예외클래스명();
//		throw new NegativeArraySizeException();
		
		//사용자가 입력한 문자열에 @가 포함되어 있지 않으면
		//MyException 예외를 발생시킨다
		//contains("찾고싶은 문자열")
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("이메일 주소를 입력하세요");
			String email = sc.next();
			
			if(!email.contains("@")) {
				throw new MyException();
			}
		} catch (MyException e) {
			System.out.println("@를 포함하지 않은 형식입니다");
			e.printStackTrace();
		}
	
	
	
	}

}
