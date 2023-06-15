package Exam;

public class Exam03 {

	public static void main(String[] args) {
		//중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
		//(x,y)형태로 출력. 단, x와 y는 10이하의 자연수입니다.
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				int cal = 4*i+5*j;
				if(cal == 60) {
					System.out.printf("(%d,%d)\n",i,j);
				}
			}
		}
	}

}
