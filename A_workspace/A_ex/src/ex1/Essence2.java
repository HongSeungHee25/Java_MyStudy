package ex1;

import java.util.Scanner;

public class Essence2 {

	public static void main(String[] args) {

		//정수를 입력받은 후, 그 숫자가 소수인지 아닌지를 
		//판단하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>");
		
		int n = sc.nextInt();
		int i = 0;
		
		for(i = 2; i <= n; i++) {
			if(n % i == 0) {//ex) 5를 2부터 3,4,5 나눴을 때 나머지가 0인건 5. 그래서 소수이다.
				break;
			}
		}
		if(i == n) {//입력받은 숫자 n과 i와 같은 숫자이면 소수.
			System.out.println(n+"은(는) 소수입니다.");
		}else {
			System.out.println(n+"은(는) 소수가 아닙니다.");
		}
	}

}
