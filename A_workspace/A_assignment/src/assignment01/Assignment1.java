package assignment01;

public class Assignment1 {
	public static void main(String[] args) {

		// 과제1

		// 자동 형변환
		// 오류가 나는 코드는 주석처리
		// 1) int 타입으로 자동 형변환 시키는 코드 작성
		// 예시) int intNum = 10L;

		// double -> int
	//	int intNum = 10.0;
		// long -> int
	//	int intNum = 10L;
		// char -> int
	//	int intNum = 10+' ';
		// float ->int
	//	int intNum = 11.0f;
		// 2) double 타입으로 자동 형변환 시키는 코드 작성

		// int -> double

		// long -> double

		// float -> double

		// char -> double

		// 3) char 타입으로 자동 형변환 시키는 코드 작성

		// int -> char

		// double -> char

		// 강제 형변환
		// 주어진 변수의 값을 이용하여 강제 형변환하여 출력하는 코드 작성
		// System.out.println((형변환 할 타입)값);

		int intVar = 65;
		long longVar = 65L;
		double doubleVar = 66.0;
		float floatVar = 66.0f;
		char spell = 'A';

		// 1) (int)다른 자료형
		System.out.println((int)doubleVar);
		System.out.println((int)longVar);
		System.out.println((int)floatVar);
		
		// 2) (double)다른 자료형
		System.out.println("=======================");

		// 3) (char)다른 자료형
		System.out.println("=======================");
	}
}
