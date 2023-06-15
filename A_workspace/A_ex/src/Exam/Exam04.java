package Exam;

public class Exam04 {

	public static void main(String[] args) {
		//for문을 이용해서 *로 삼각형 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
