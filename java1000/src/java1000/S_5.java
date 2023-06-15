package java1000;

public class S_5 {

	public static void main(String[] args) {
		//밥값 계산하기
		int donprice = 8000; //돈까스 가격
		int kalprice = 10000; //칼국수 가격
		int kingprice = 5000; //왕만두 가격
		
		int donNumber = 16; //돈까스 수량
		int kalNumber = 8; //칼국수 수량
		int kingNumber = 1; //왕만두 수량
		
		System.out.printf("%s x %2d = %6d\n","돈까스",donNumber, donprice*donNumber);
		System.out.printf("%s x %2d = %6d\n","칼국수",kalNumber, kalprice*kalNumber);
		System.out.printf("%s x %2d = %6d\n","왕만두",kingNumber, kingprice*kingNumber);
		System.out.println("================");
		int sum = donprice*donNumber+kalprice*kalNumber+kingprice*kingNumber;
		System.out.printf("%s: %d\n","총합",sum);
	}

}
