package Lesson_1;

import java.util.Scanner;

public class Lesson1 {
	public static void main(String[] args) {
		//영문소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 
		//모든 문자를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력해주세요>>");
		char alphabet = sc.nextLine().charAt(0);
		//문자열의 첫번째 문자를 alphabet에 저장 
		int i;
		
		for(i ='a';i<alphabet;i++) {
			if(i<alphabet) {
				System.out.print((char)i);
			}System.out.println();
		}
	}
}
