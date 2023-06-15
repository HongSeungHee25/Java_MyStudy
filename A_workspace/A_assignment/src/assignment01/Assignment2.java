package assignment01;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		

		// 과제1.
		// 사용자에게 금액을 입력받고 부를 수 있는 노래 곡 수와 잔돈을 출력하기
		// 1곡당 300원
		// 입력예시: 금액 입력하세요 >> 1000
		// 결과예시: 3곡을 부를 수 있으며 잔돈은 100원 입니다
		System.out.println("============과제1============");
		Scanner sc=new Scanner(System.in);
		int price = 300;
		int money = 0;
		int sum = 0;
		int changes = 0;
		
		System.out.println("금액을 입력하세요>>");
		money = sc.nextInt();
		sum = money / price;
		changes = money-price*sum;
		
		System.out.println(sum+"곡을 부를 수 있으며 잔돈은 "+changes+"원 입니다");
		
		// Scanner sc = new Scanner(System.in);
		// int price = 300;
		// int money = 0;
		// int count = 0;
		// int change = 0;
		//
		// System.out.println("금액을 입력하세요");
		// money = sc.nextInt();
		// // 횟수
		// count = money / price;
		// // 잔돈
		// change = money % price;
		//
		// System.out.println(count + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다");
		
		// 과제2.
		// 사용자에게 두자리 정수를 입력받고 일의 자리 숫자와 십의자리 숫자를 출력하기
		// 단, 입력메소드는 nextInt() 를 사용
		// 입력예시: 두자리 정수를 입력하세요 >> 27
		// 출력예시:
		// 십의 자리 숫자는 2 입니다
		// 일의 자리 숫자는 7 입니다
		System.out.println("============과제2============");
		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		
		System.out.println("두자리 정수를 입력하세요>>");
		num = sc1.nextInt();
		char ten = Integer.toString(num).charAt(0);
		char one = Integer.toString(num).charAt(1);
		
		System.out.println("십의 자리 숫자는 "+ten+" 입니다");
		System.out.println("일의 자리 숫자는 "+one+" 입니다");
		
		// Scanner sc = new Scanner(System.in);
		// int ten = 0;
		// int one = 0;
		// int num = 0;
		//
		// System.out.println("두자리 정수를 입력하세요");
		// num = sc.nextInt();
		//
		// ten = num / 10;
		// one = num % 10;
		//
		// System.out.println("십의 자리 숫자는 " + ten + " 입니다");
		// System.out.println("일의 자리 숫자는 " + one + " 입니다");
		
		// 과제3.
		// 당신은 사막을 동물 1마리와 모험을 떠나려고 합니다
		// 함께할 동물을 선택하세요(1. 사자 2. 원숭이 3. 소 4. 말 5. 양)이라고 주어진 문자열 출력하고
		// 정수를 입력받아 결과를 출력하기

		// 입력예시 : 함께할 동물을 선택하세요(1. 사자 2. 원숭이 3. 소 4. 말 5. 양)>> 1
		// 출력예시 : 당신에게 가장 소중한것은 우정입니다
		System.out.println("============과제3============");
		String msg = "당신은 사막을 동물 1마리와 모험을 떠나려고 합니다\n" 
		+ "함께할 동물을 선택하세요(1. 사자 2. 원숭이 3. 소 4. 말 5. 양)";

		Scanner sc2 = new Scanner(System.in);
		int num1 = 0;
		System.out.println(msg);
		num1 = sc2.nextInt();
		
		String rion = "자존심";
		String monkey = "우정";
		String cow = "직업";
		String horse = "가족";
		String sheep = "사랑";
		
		if(num1==1) {
			System.out.println("당신에게 가장 소중한것은 "+rion+"입니다");
		}else if(num1==2) {
			System.out.println("당신에게 가장 소중한것은 "+monkey+"입니다");
		}else if(num1==3) {
			System.out.println("당신에게 가장 소중한것은 "+cow+"입니다");
		}else if(num1==4) {
			System.out.println("당신에게 가장 소중한것은 "+horse+"입니다");
		}else if(num1==5) {
			System.out.println("당신에게 가장 소중한것은 "+sheep+"입니다");
		}
		
		// String rion = "자존심";
		// String monkey = "우정";
		// String cow = "직업";
		// String horse = "가족";
		// String sheep = "사랑";
		//
		//
		// Scanner sc = new Scanner(System.in);
		// int choice = 0;
		// String result = null;
		// System.out.println(msg);
		// choice = sc.nextInt();
		//
		// result = choice == 1 ? rion : choice == 2 ? monkey : choice == 3 ? cow : choice == 4 ? horse : sheep;
		// System.out.println("당신에게 가장 소중한것은 " + result + " 입니다");

		// 과제4.
		// 사용자에게 점수를 입력받고 해당 점수에 맞는 등급을 출력하기(최대점수 = 100점 최하점수 = 0)
		// 90점 이상: A등급
		// 80점 이상 90점 미만: B등급
		// 70점 이상 80점 미만: C등급
		// 70점 미만: F등급
		// 입력예시 : 점수를 입력하세요>> 97
		// 결과예시 : A등급 입니다
		System.out.println("============과제4============");
		Scanner sc3 = new Scanner(System.in);
		int testscore = 0;
		String result = null;
		
		
		System.out.println("점수를 입력하세요>>");
		testscore = sc3.nextInt();
		
		if(testscore>=90) {
			result="A등급";
		}else if(testscore>=80) {
			result="B등급";
		}else if(testscore>70) {
			result="C등급";
		}else {
			result="F등급";
		}System.out.println(result+"입니다");
		
		// Scanner sc = new Scanner(System.in);
		// String grade = null;
		// int score = 0;
		// System.out.println("점수를 입력하세요");
		// score = sc.nextInt();
		//
		// if(score >= 90) {
		// grade = "A등급";
		// }else if(score >= 80) {
		// grade = "B등급";
		// }else if(score >= 70) {
		// grade = "C등급";
		// }else {
		// grade = "F등급";
		// }
		//
		// System.out.println(grade + " 입니다");

		// 과제5.
		// 사용자에게 월을 입력받고 해당 월의 마지막일을 출력하기
		// 2월은 28일까지. 4,6,9,11월은 30일까지. 나머지는 31일까지.
		// 입력예시: 월을 입력하세요 >> 2
		// 결과예시: 2월의 마지막일은 28일 입니다
		System.out.println("============과제5============");
		Scanner sc4 = new Scanner(System.in);
		int date = 0;
		String month = null;
		
		System.out.println("월을 입력하세요>>");
		date = sc4.nextInt();
		
		if(date==4||date==6||date==9||date==11) {
			month = "30일";
		}else if(date==2) {
			month = "28일";
		}else {
			month = "31일";
		}System.out.println(date+"월의 마지막일은 "+month+" 입니다");
		
		// Scanner sc = new Scanner(System.in);
		// int month = 0;
		// String result = null;
		// System.out.println("월을 입력하세요");
		// month = sc.nextInt();
		// switch(month) {
		//
		// case 2:
		// result = "28일";
		// break;
		// case 4: case 6: case 9: case 11:
		// result = "30일";
		// break;
		// default:
		// result = "31일";
		// break;
		// }
		// System.out.println(month + "월은 " + result + "까지 있습니다");
		
		// 과제6. (심화) (HINT: 아스키코드)
		// 사용자에게 영어 알파벳 한글자를 입력받고 대소문자 여부와 대문자면 소문자, 소문자면 대문자로 바꿔서 출력하기
		// 단, 배우지 않은 메소드는 사용하지 않기
		// 입력예시 : 알파벳 한글자를 입력하세요 >> A
		// 결과예시 : 대문자 입니다 소문자로는 a 입니다
		System.out.println("============과제5============");
		Scanner sc5 = new Scanner(System.in);
		char abc = ' ';
		String str = "";
		String str1 = "";
		
		System.out.println("알파벳 한글자를 입력하세요>>");
		abc = sc5.next().charAt(0);
		
		if(abc>='a'&&abc<='z') {
			str = "소문자";
		}else if(abc>='A'&&abc<='Z') {
			str = "대문자";
		}
		
		// Scanner sc = new Scanner(System.in);
		// char spell = ' ';
		//
		// System.out.println("알파벳 한글자를 입력하세요");
		// spell = sc.next().charAt(0);
		//
		// if(spell >= 'A' && spell <= 'Z') {
		// System.out.println("대문자 입니다 소문자로는 " + (char)(spell+32) + " 입니다" );
		// }else if(spell >= 'a' && spell <= 'z') {
		// System.out.println("소문자 입니다 대문자로는 " + (char)(spell-32) + " 입니다" );
		// }
		
	}

}
