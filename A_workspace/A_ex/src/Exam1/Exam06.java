package Exam1;

public class Exam06 {

	public static void main(String[] args) {
		//알파벳 대문자,소문자 개수와 소문자+대문자 개수 출력
		
		int cap = (int)'Z'-(int)'A'+1; //알파벳 대문자 개수
		int small = (int)'z'-(int)'a'+1; //알파벳 소문자 개수
		System.out.println("대문자 개수 : "+cap);
		System.out.println("소문자 개수 : "+small);
		System.out.printf("알파벳 전체 개수 : %d",cap+small);
	}

}
