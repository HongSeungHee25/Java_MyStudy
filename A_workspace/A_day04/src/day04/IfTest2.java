package day04;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
		//실습1
		
		//사용자에게 주만번호 맨 뒷자리를 입력받는다(정수 1개)
		//뒷자리가 1,6이면 "월"/ 2,7이면 "화" / 3,8이면 "수" / 4,9이면 "목" / 5,0이면 "금"
		//주민번호 맨 뒷자리에 따라 예방 접종 요일을 출력하기
		
		//입력예시 : 
		//주민번호 맨 뒷자리를 입력하세요>> 3
		
		//결과예시 : 
		//예방 접종일은 수요일 입니다
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String result = null;
		
		System.out.println("주민번호 맨 뒷자리를 입력하세요>>");
		num = sc.nextInt();
		
		if(num==1||num==6) {
			result = "월";
		}else if(num==2||num==7) {
			result = "화";
		}else if(num==3||num==8) {
			result = "수";
		}else if(num==4||num==9) {
			result = "목";
		}else{
			result = "금";
		}
//		if(num % 5 == 1) {
//			result = "월";
//		}else if(num % 5 == 2) {
//			result = "화";
//		}else if(num % 5 == 3) {
//			result = "수";
//		}else if(num % 5 == 4) {
//			result = "목";
//		}else{
//			System.out.println("접종 요일은 금요일입니다");
//	}
		System.out.println("접종 요일은 "+result+"요일 입니다");
	}

	}
