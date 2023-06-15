package Exam1;

public class Exam01 {

	public static void main(String[] args) {
		//영문자 모음의 아스키 코드 값 매칭 프로그램
		String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < alpa.length(); i++) {
			//alpa.length는 String alpa의 문자열 길이
			char askii = alpa.charAt((int)i);
			//alpa.charAt(i)는 "ABCDEFGHIJKLMNOPQRSTUVWXYZ"의 문자열 중
			//i번째 문자를 선택하는 메서드
			System.out.println(askii+" = "+(int)askii);
		}
	}

}
