package day03;

import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		
		//실습1
		//사용자에게 일자를 입력받아 출력하기
		
		//입력예시 자바 3일
		//결과예시 오늘은 자바 3일차 수업입니다
		
//		Scanner sc = new Scanner(System.in);
//		String classDate = null;
		
//		System.out.println("오늘은 수업 몇일차 입니까?>>");
//		classDate = sc.nextLine();
		
		
		//출력메서드를 통해 어떤값을 입력할건지 물어본다
		
		//입력메서드를 통해 입력받고 값을 저장한다
		
//		System.out.println("오늘은 "+classDate+"차 수업입니다");
		
		
		//실습2 (next() 메서드 사용)
		//사용자에게 두자리 정수를 입력받고 일의 자리 숫자와
		//십의 자리 숫자를 출력하기(단,입력은 1번만 받는다)
		
		//입력예시 27
		//십의 자리 숫자는 2입니다
		//일의 자리 숫자는 7입니다
		
//		Scanner sc =new Scanner(System.in);
//		String num = null;
		
//		System.out.println("두 자리 정수를 입력하세요");
		//사용자에게 입력받은 정수를 저장한다
//		num=sc.next();
		
		//입력받은 정수에서 십의 자리를 분리한다
//		char ten=num.charAt(0);
		
		//입력받은 정수에서 일의 자리를 분리한다
//		char one=num.charAt(1);
//		System.out.println("십의 자리 숫자는 "+ten+"입니다");
//		System.out.println("일의 자리 숫자는 "+one+"입니다");
		
		
		//nextInt() 정수형만 가져온다
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		
		System.out.println("입력하신 정수는 "+num+" 입니다");
		
	}

}
