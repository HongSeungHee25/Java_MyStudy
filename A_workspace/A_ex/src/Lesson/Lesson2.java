package Lesson;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		//한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("건물이 몇 층인지 입력해주세요>>");
		int a = sc.nextInt();
		int Building = 5; //한 층의 높이는 5m
		
		int result = a * Building; 
		//한 층의 높이가 5m이기 때문에 입력받은 수와 연산 작업을 해줘함
		System.out.println("입력하신 건물의 층 수는 "+a+"층 입니다.");
		System.out.println("따라서 건물의 높이는 "+result+"m 입니다.");
	}

}
