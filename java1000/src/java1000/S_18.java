package java1000;

public class S_18 {

	public static void main(String[] args) {
		//삼각형 별 찍기 2
		for(int i = 1; i <= 5; i++) { //각 줄에 대한 반복
			//공백 출력
			for(int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			//별표 출력
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(); //줄바꿈
		}
	}

}
