package java1000;

public class S_11 {

	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		//잘못된 파라미터
//		printSquare("hello"); //printSquare메서드에 int타입이지만 
		//현재 main메서드에서 String타입으로 전달하고 있기 때문에 오류발생
//		printSquare(5.5); //printSquare메서드에 int타입이지만
		//현재 main메서드에서 double타입으로 전달하고 있기 때문에 오류발생
	}

}
