package day03;

import java.util.Scanner;

public class Oper1 {

	public static void main(String[] args) {
		
		//단항 연산자
		System.out.println("단항연산자==============");
		
		int num=10;
		System.out.println(+num);
		System.out.println(-num);
		
		System.out.println(num);
		
		boolean isTrue = true;
		System.out.println(!isTrue);
		System.out.println(isTrue);
		
		//증감 연산자
		System.out.println("증감연산자==============");
		int num2 = 5;
		
		//num2=num2+1;
		System.out.println("후위형 : "+num++);
		System.out.println(num2);

		num2=5;
		System.out.println("전위형 : "+ ++num2);
		System.out.println(num2);
		
		num2 = 5;
		System.out.println("후위형 : "+num2--);
		System.out.println(num2);
		
		//산술 연산자
		System.out.println("산술연산자================");
		
		int num3=10;
		int num4=3;
		
		System.out.println(num3 + num4);
		System.out.println(num3 - num4);
		System.out.println(num3 * num4);
		// 몫을 구한다
		System.out.println(num3 / num4);
		// 나머지를 구한다
		System.out.println(num3 % num4);
		
		// 문자열은 연산이 아닌 연결이 된다 (+)
		System.out.println("안녕"+"하세요");
		//System.out.println("안녕"-"하세요");
		
	
	//실습1
	//사용자에게 수학점수, 국어점수, 영어점수를 입려받고
	//평균과 합계점수를 출력하기
	//입력예시 100,90,100
	//결과예시 합계점수 = 290 평균점수 = 96.6666666667
	
		Scanner sc = new Scanner(System.in);
		int math = 0;
		int korean = 0;
		int english = 0;
	
		int sum = 0;
		double avg = 0.0;
	
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		System.out.println("국어 점수를 입력하세요");
		korean = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		english = sc.nextInt();
			
		//합계를 구한다
		sum = math + korean + english;
		avg = sum / 3.0;
//		avg = (double)sum /3;
	
		System.out.println("합계점수 = "+sum);
		System.out.println("평균점수 = "+avg);
	
	
	
}
}
