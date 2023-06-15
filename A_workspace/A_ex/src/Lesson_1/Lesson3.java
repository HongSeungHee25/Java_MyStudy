package Lesson_1;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		//정수를 입력 받아 짝수와 홀수를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("판별할 정수를 입력하세요>>");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num == 0) {
			System.out.println("입력하신 정수는 '짝수'입니다");
		}else {
			System.out.println("입력하신 정수는 '홀수'입니다");
		}
		
	}

}
