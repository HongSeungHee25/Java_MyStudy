package java1000;

public class S_12 {

	public static void printSquare(double x) {
		System.out.println(x * x);
	}
	
	
	public static void main(String[] args) {
		//잘못된 파라미터2
		printSquare(3);
		//위에 코드는 printSquare메서드에서 double타입의 파라미터를 받지만
		//정상적으로 실행된다. 이 경우는 자바에서는 자동 형변환이 발생하기 때문에
		//int타입을 적어도 double타입으로 변환되어 전달된다.
	}
}
