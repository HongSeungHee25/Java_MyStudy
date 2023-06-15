package Lesson;

import java.util.Scanner;

public class Lesson6 {

	public static void main(String[] args) {
		//돈의 액수를 입력받아 오만원권,만원권,천원권,500원짜리 동전,
		//100원짜리 동전,10원짜리 동전,1원짜리 동전 각 몇 개로 
		//변환되는지 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
		int money = sc.nextInt();
		int sum = 0;
		
		if(money % 50000 != 0) {
			sum = money / 50000;
			System.out.print("5만원권은 "+sum+"장, ");
			money = money - (sum * 50000);
			
			sum = money / 10000;
			System.out.print("1만원권은 "+sum+"장, ");
			money = money - (sum * 10000);
			
			sum = money / 1000;
			System.out.print("1천원권은 "+sum+"장,\n");
			money = money - (sum * 1000);
			
			sum = money / 500;
			System.out.print("500원은 "+sum+"개, ");
			money = money - (sum * 500);
			
			sum = money / 100;
			System.out.print("100원은 "+sum+"개, ");
			money = money - (sum * 100);
			
			sum = money / 10;
			System.out.print("10원은 "+sum+"개, ");
			money = money - (sum * 10);
			
			sum = money / 1;
			System.out.print("1원은 "+sum+"개 입니다");
			money = money - (sum * 1);
		}else {
			sum = money / 50000;
			System.out.println("5만원권만 "+sum+"장 입니다.");
		}
	}

}
