package day05;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		//While(조건식) 조건식이 참인동안 코드를 반복실행한다
		
		int num = 0;
		while(num<10) {
			System.out.println("안녕하세요");
			num++;
		}
		//실습1. 사용자에게 정수를 입력받고 입력한 횟수만큼
		//hello 라고 출력하기
		Scanner sc=new Scanner(System.in);
		int num2=0;
		int count=0;
		
		System.out.println("몇번 출력할까요?>>");
		num2=sc.nextInt();
		
		while(count<num2) {
			System.out.println("hello");
			count++;
		}
		//실습2. 사용자에게 양의 정수를 1개씩 총 3개 입력받는다
		//단, 음의 정수를 입력하면 음의 정수를 입력하였습니다 라고 출력하고 
		//다시 입력받는다 양의 정수가 3개가 다 입력되면 프로그램 종료라고 출력하기
		
		int userCount = 0;
		int num3 = 0;
		
		Scanner sc1 = new Scanner(System.in);
		
		while(userCount<3) {
			System.out.println("양의 정수를 입력하세요");
			num3=sc1.nextInt();
			if(num3>0) {
				userCount++;
			}else {
				System.out.println("음의 정수를 입력하였습니다");
			}
		}System.out.println("프로그램 종료!");
	}

}
