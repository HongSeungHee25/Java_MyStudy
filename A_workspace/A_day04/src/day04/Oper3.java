package day04;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
		
		
		//실습1
		//사용자가 입력한 사물함 번호와 비밀번호 일치 여부 출력하기
		//사물함 번호(정수10) 비밀번호(kim10)
		
		//입력예시 : 
		//사물함 번호를 입력하세요>> 10
		//사물함 비밀번호를 입력하세요>> kim10
		
		//결과예시 : 
		//사물함 번호 : true
		//비밀번호 : true
		
		Scanner sc = new Scanner(System.in);
		int lockerNumber = 10;
		String password = "kim10";
		
		int userLocker = 0;
		String userPW= null;
		
		//사용자에게 사물함 번호를 입력받는다(사물함 번호: 정수)
		System.out.println("사물함 번호를 입력하세요>>");
		userLocker=sc.nextInt();
		//사용자에게 사물함 비밀번호를 입력받는다(사물함 비밀번호: 문자열)
		System.out.println("사물함 비밀번호를 입력하세요>>");
		userPW=sc.next();
		
		System.out.println("사물함 번호: "+(userLocker==lockerNumber));
		System.out.println("비밀번호 번호: "+(userPW.equals(password)));
		
	}

}
