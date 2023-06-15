package day04;

import java.util.Scanner;

public class Oper5 {

	public static void main(String[] args) {
		
		//조건식
		
		System.out.println(10>0);
		System.out.println(10>0 && 10>11);
		System.out.println("ABC".equals("ABC"));
		
		//삼항 연산자
		
		String msg=10 > 0 ? "양수" : "음수";
		System.out.println(msg);
		
		boolean bool = 10 > 0 && 10 > 11 ? true:false;
		System.out.println(bool);
		
		int num = "ABC".equals("ABC") ? 100:0;
		System.out.println(num);
		
//		Scanner sc = new Scanner(System.in);
		//삼항 연산자의 값을 담는 변수
//		String result = null;
		//입력한 정수의 값을 담는 변수
//		int num2=0;
		
		
//		System.out.println("정수를 입력하세요");
//		num2=sc.nextInt();
//		result=num2>0 ? "양수" : "음수";
		
//		System.out.println(result);
		
		//실습1
		//사용자에게 정수를 입력받고 짝수 홀수를 판별한다
		
		//입력예시 : 
		//양의 정수를 입력하세요 >> 20
		
		//결과예시 : 
		//짝수 입니다
		
//		Scanner sc = new Scanner(System.in);
//		int num3=0;
//		String result = null;
//		
//		System.out.println("양의 정수를 입력하세요>>");
//		num3=sc.nextInt();
//		result=num3 % 2 == 0 ? "짝수 입니다" : "홀수 입니다";
//		System.out.println(result);
//		
//		System.out.println(num3 % 2 == 0 ? "짝수 입니다" : "홀수 입니다");
//		
//		//짝수,홀수,0을 판별하기
//		result = num3 % 2 == 0 ? "짝수 입니다" : num3 == 0 ? "0 입니다" : "홀수 입니다";
//		
		//실습2
		//사용자에게 나이를 입력받고
		//나이에 따라 취득 가능한 면허를 출력하기
		
		//19세 이상 운전면허
		//17세 이상 오토바이
		//17세 미만 도보
		
		//입력예시 : 
		//나이를 입력하세요 >> 19
		//결과예시 : 
		//운전면허 가능
		
		Scanner sc = new Scanner(System.in);
		
		int age=0;
		String result = null;
		
		System.out.println("나이를 입력하세요>>");
		age=sc.nextInt();
		
		result=age >= 19 ? "운전면허 가능" : age >= 17 ? "오토바이 가능" : "도보 가능";
		System.out.println(result);
						
	}

}
