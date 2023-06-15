package day02;

public class TypeCastingTest {

	public static void main(String[] args) {

		// 자동 형변환
		// 정수 + 실수 = 실수
		int num = 5;
		double num2 = 17.2;

		double result = num + num2;

		System.out.println(num + num2);
		System.out.println(result);

		// 문자 + 정수 = 정수
		char word = 'A';
		int num3 = 1;
		int result2 = word + num3;

		System.out.println(word + num3);
		System.out.println(result2);

		double num4 = 10;
		System.out.println(num4);

		// 강제 형변환
		System.out.println((int) 3.14);
		System.out.println((double) 10);
		System.out.println((char) 65);

	}

}
