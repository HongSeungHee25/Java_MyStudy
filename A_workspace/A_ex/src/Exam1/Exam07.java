package Exam1;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		//알파벳을 입력 받아 대문자 -> 소문자 / 소문자 -> 대문자
		//출력 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력>>");
		String inputStr = sc.nextLine();
		
		//입력받은 알파벳을 한 글자씩 대문자 또는 소문자로 변경
		for(int i=0; i<inputStr.length(); i++) {
			//입력받은 문자열의 i번째 문자를 선택해 대/소문자 변경
			char alpa = inputStr.charAt(i);
			
			//대문자를 소문자로 변경
			if(64<(int)alpa&&(int)alpa<91) {
				int small = (int)alpa+32;
				System.out.print((char)small);
			}
			//소문자를 대문자로 변경
			if(96<(int)alpa&&(int)alpa<123) {
				int cap = (int)alpa - 32;
				System.out.print((char)cap);
			}
			
		}sc.close();
		
	}
}
