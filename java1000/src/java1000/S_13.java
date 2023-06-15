package java1000;

import java.util.Scanner;

public class S_13 {

	public static String getRole(int age) {
		if(age >= 18) {
			return "성인";
		}else if(age >= 13) {
			return "청소년";
		}else if(age >= 6) {
			return "어린이";
		}else {
			return "유아";
		}
	}
	
	public static void main(String[] args) {
		//버스카드 나이인식
		//성인 : 만 18세 이상
		//청소년 : 만 13세 이상
		//어린이 : 만 6세 이상
		//유아 : 만 5세 이하
		
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력해주세요>>");
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role+"입니다.");
	}

}
