package Lesson;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		//2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
		//(50,50)과 (100,100)의 두 점으로 이루어진 사각형이 있을때,
		//입력 값(x, y)를 받아 이 직사각형 안에 있는지 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x, y)의 좌표를 입력하세요>>");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 50 && x < 100 && y > 50 && y < 100) {
			System.out.println("점("+x+","+y+")는 (50,50)과 (100,100)의 '사각형 내'에 있습니다.");
		}else {
			System.out.println("점("+x+","+y+")는 (50,50)과 (100,100)의 '사각형 밖'에 있습니다.");
		}
	}

}
