package Exam1;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//정수를 입력 받고 정수를 나눌 수를 입력 받은 다음
		//몫과 나머지 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.close();
		
		System.out.printf("몫 : %d\n",num/num1);
		System.out.printf("나머지 : %d",num%num1);
	}

}
