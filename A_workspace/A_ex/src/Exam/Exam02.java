package Exam;

public class Exam02 {
	public static void main(String[] args) {
		//while문과 Math.random()메서드를 이용해서 두 개의 주사위를 
		//던졌을 때 나오는 눈을(눈1,눈2)형태로 출력하고,
		//눈의 합이 5가 아니면 계속 주사위를 던지고,눈의 합이 5이면 멈춤
		
		while(true) {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			
			if(i + j == 5) {
				System.out.printf("(%d,%d)",i,j);
				break;
			}
			System.out.printf("(%d,%d)\n",i,j);
		}
	}
}
