package day05;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		
		//실습1. 1부터 50까지 츨력하기
		
		//for(초기식; 조건식; 증감식){ }
		
		for(int i=1;i<=50;i++) {
			System.out.println(i+"출력하기");
		}
		//실습2. 50부터 1까지 출력하기
		
		for(int i=50;i>=1;i--) {
			System.out.println(i+"출력하기");
		}
		//실습3. 정해진 for문을 완성해서 5부터 1까지 출력하기
		
		for(int i=0;i<5;i++) {
			System.out.println(5-i);
		}
		//사용자가 정해준 횟수만큼 반복한다
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("몇번 반복할까요?");
		num = sc.nextInt();
		
		for (int i = 0; i <num; i++) {
			System.out.println("hello");
		}
		
		//1부터 10까지 중에서 짝수번째만 출력한다
		for (int i = 0; i <=10; i++) {
			if(i%2==0) {
				System.out.println("hello!");
			}
		}
		
		//실습4. 사용자에게 정수를 입력받고
		//0부터 입력한 정수까지 출력한다(단, 홀수만)
		
		Scanner sc1 = new Scanner(System.in);
		int num2 = 0;
		
		System.out.println("정수를 입력하세요>>");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
			System.out.println(i);
		}}
		
		//실습5. 1~50까지의 합계를 출력하기
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum+=i;
			//sum = sum + i;
		}
		System.out.println(sum);
	}

}
