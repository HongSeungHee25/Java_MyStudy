package Exam1;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//1달러는 현재 1217.20원 입니다. 달러를 입력 받아 원화로 보여주는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요 : ");
		double dollor = sc.nextDouble();
		double won = 1217.20;
		
		System.out.printf("원화 : %.2f",dollor*won);
		//%.2f ==> 소수점 둘째 자리까지만 출력
	}

}
