package java1000;

import java.util.Scanner;

public class S_7 {

	public static void main(String[] args) {
		//환전하기
		Scanner sc = new Scanner(System.in);
		System.out.print("유로를 입력해주세요>>");
		int euro = sc.nextInt();
		System.out.print("달러를 입력해주세요>>");
		int dollar = sc.nextInt();
		
		double euroRate = 1320.48026;
		double dallarRate = 1063.82979;
		
		int won = (int)(euro*euroRate+dollar*dallarRate);
		System.out.println(euro+"유로 + "+dollar+"달러 = "+won+"원");
	}

}
