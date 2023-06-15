package Lesson;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		//두 정수를 입력받고 두 정수의 합을 구해 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = x+y;
		System.out.println(x+" + "+y+" 의 합계는 "+sum+"입니다");
	}

}
