package day02;

public class FormatTest {

	public static void main(String[] args) {

		String weather = "맑음";
		int month = 2;
		int date = 19;
		double max = 5.0;
		double min = 0.1;

		// 변수를 이용하여 값을 전달하기
		System.out.printf("오늘의 날씨는 %s 입니다", weather);
		System.out.println("오늘의 날씨는" + weather + "입니다");

		// 값 자체를 전달하기
		System.out.printf("오늘의 날씨는 %s 입니다", "맑음");

		// 실수
		// 반올림하여 소수점 여섯번째자리까지 출력이 된다
		System.out.printf("오늘의 최고 기온은 %f도 입니다", max);
		System.out.printf("오늘의 최저 기온은 %f도 입니다", min);

		// 정수
		System.out.printf("코카콜라의 가격은 %5d원 입니다\n", 5);
		System.out.printf("코카콜라의 가격은 %-5d원 입니다\n", 5);
		System.out.printf("코카콜라의 가격은 %05d원 입니다\n", 5);

		// 문자열
		System.out.printf("%.2s의 가격은 1000원 입니다\n", "코카콜라");

		// 실습1.
		// 원주율 perimeter을 값을 3.1416dmfh 출력하려고 한다
		// printf() 를 사용하여 출력(변수 사용, 값 수정 x)
		// 결과 : 원주율 = 3.1416
		double perimeter = 3.1415926358979;

		System.out.printf("원주율 = %.4f", perimeter);

	}

}
