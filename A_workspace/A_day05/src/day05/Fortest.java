package day05;

public class Fortest {

	public static void main(String[] args) {
		
//		//10번 안녕하세요라고 출력하기
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("안녕하세요");
//			System.out.println(i);
//		}
		
		//for(초기식;조건식;증감식){ }
		
		for (int i=1;i<=5;i++) {
			System.out.println(i+"번째 출력");
		}
		for(int i=5;i>=0;i--) {
			System.out.println(i+"번째 출력");
		}
		for (int i=0;i<6;i+=2) {
			System.out.println(i+"번째 출력");
		}
	}

}
