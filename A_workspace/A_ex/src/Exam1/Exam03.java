package Exam1;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//초를 입력하면 시간으로 변환해주는 프로그램
		Scanner sc =new Scanner(System.in);
		System.out.print("초를 입력하세요>>");
		int time = sc.nextInt();
		sc.close();
		
		int hour = time/3600;
		int minute = (time % 3600)/60;
		int second = (time % 3600)%60;
		
		System.out.println("결과 출력 : "+hour+"시간 "+minute+"분 "+second+"초");
		
		//3600초를 입력하면 '1시간0분0초'를 출력하는게 아니라 
		//1시간으로 출력되게 하기 위한 조건문
//		if(hour != 0) {
//			System.out.printf("결과 출력 : %d시간",hour);
//		}if(minute != 0) {
//			System.out.printf("%d분 ",minute);
//		}if(second != 0) {
//			System.out.printf("%d초 ",second);
//		}
	}

}
