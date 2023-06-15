package Lesson_3;

public class Lesson1 {

	public static void main(String[] args) {
		//10진수와 2진수,8진수,16진수를 어떻게 표현하는지 프로그래밍 하기
		
		int num = 10;
		int numA = 0B1010; //0B = 2진수 라는 뜻
		int numB = 012; //0으로 시작하면 = 8진수 라는 뜻
		int numC = 0XA; //0X = 16진수 라는 뜻, A는 10을 의미함
						//9,A,B,C,D,E,F,10,11,12,13,14,15,16...
		
		System.out.println(num);
		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);
	}

}
