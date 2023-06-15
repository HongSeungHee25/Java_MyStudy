package ex;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고
		//입력받으세요. 
		//한 과목이라도 8개 미만인 경우, "불합격입니다!"를 출력하고 개수가 60개
		//이상이면"합격입니다!"를 출력하는 프로그램 만들어보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DB : ");
		int num = sc.nextInt();
		
		System.out.println("전자계산기 구조 : ");
		int num1 = sc.nextInt();
		System.out.println("OS : ");
		int num2 = sc.nextInt();
		System.out.println("데이터 통신 : ");
		int num3 = sc.nextInt();
		System.out.println("소프트웨어 공학 : ");
		int num4 = sc.nextInt();
		int sum = num+num1+num2+num3+num4;
		if(num<8||num1<8||num2<8||num3<8||num4<8||sum<60) {
			System.out.println("불합격입니다!");
		}else {
			System.out.println("합격입니다!");
		}
	}

}
