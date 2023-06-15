package exceptionTest;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		//사용자에게 정수를 입력받아서 1~100 까지의 
		//범위중에서 해당 정수의 배수의 개수를 구한다
		
		//단축키 : try에 넣을 코드 선택 + alt + shift + z
		try {
			Scanner sc = new Scanner(System.in);
			int num = 0;
			System.out.println("1~100 중에서 해당 정수의 양의 배수 구하기");
			System.out.println("양의 정수를 입력하세요");
			num = sc.nextInt();
			
			System.out.println("입력하신 정수 배수의 개수 = "+(100/num));
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산입니다. 0으로 나눌수 없습니다");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//0을 입력하였을 경우 java.lang.ArithmeticException 발생한다
	
		
		
	}

}
