package java1000;

public class S_10 {

	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	public static void main(String[] args) {
		//메서드의 실행흐름
		int value = 2;
		System.out.println(value);
		printSquare(value);
		printSquare(3);
		printSquare(value * 2);
	}

}
