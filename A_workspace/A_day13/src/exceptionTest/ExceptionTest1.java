package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		//int num = sc.nextInt(); //정수가 아닌 다른 문자 입력시 프로그램이 비정상적으로 종료된다
//		
//		//프로그램의 비정상적인 종료를 막기위해 예외 처리를 한다
//		try {
//			//예외가 발생할 수 있는 코드
//			int num = sc.nextInt();
//		}catch(InputMismatchException e) {
//			System.out.println("정수를 입력하지 않았습니다");
//			
//			//예외 클래스의 메서드
//			//toString() : 해당 클래스의 이름 반환한다
//			System.out.println(e);
//			System.out.println(e.toString());
//			
//			//gerMessage() : 예외 메세지를 문자열로 반환한다
//			System.out.println(e.getMessage());
//			
//			//printStrackTrace() : 예외 발생 시점을 추적하여 단계별로 출력한다
//			e.printStackTrace();
//			
//		}catch(Exception e) {
//			//예외가 발생하면 실행할 코드
//			System.out.println("잘못된 입력입니다");
//		}
//		
//		System.out.println("hello");
//		
		//정수 형태의 값을 입력하지 않았을 경우
		//InputMismatchException 가 발생한다
		
		//음수의 값을 입력하였을 경우
		//NegativeArraySizeException 가 발생한다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇칸 짜리 배열을 만들까요?");
//		
//		int num = sc.nextInt();
//		//배열의 길이는 0은 가능하지만 음수는 불가능하다
//		int[] ar = new int[num];
//		System.out.println(ar.length);
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("몇칸 짜리 배열을 만들까요?");
			
			int num = sc.nextInt();
			//배열의 길이는 0은 가능하지만 음수는 불가능하다
			int[] ar = new int[num];
			System.out.println(ar.length);
			
		}catch(InputMismatchException e) {
			System.out.println("정수형태의 값을 입력하세요");
		}catch(NegativeArraySizeException e) {
			System.out.println("음수를 입력하였습니다");
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다");
		}
		
	}

}
