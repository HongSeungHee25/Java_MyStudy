package Exam1;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//Exam01 문제 응용 -> 입력받은 영문자의 아스키 코드값 출력 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 입력해주세요>>");
		String alpa = sc.nextLine();
		
		for(int i=0;i<alpa.length();i++) {
			//반복문으로 입력받은 문자열의 문자 한개씩을 선택해 아스키 코드로 출력
			char askii = alpa.charAt((int)i);
			System.out.println(askii+" = "+(int)askii);
		}
	}

}
