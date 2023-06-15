package day02;

public class EscapeStringTest {

	public static void main(String[] args) {

		// 제어문자

		System.out.println("줄바꿈\n연습");
		System.out.println("\t탭연습");
		System.out.println(" 탭 연습\t");
		System.out.println("\"안녕하세요\"");
		System.out.println("\'이것\'을 강조");

		// 실습1.
		// 문자열을 수정하여 실행 결과처럼 출력한다
		// 출력메소드는 1번만 사용한다

		System.out.println("봄여름가을겨울");

		// 실행결과
		// 봄
		// 여름
		// 가을
		// 겨울

		System.out.println("봄\n\t여름\n가을\n\t겨울");

	}

}
