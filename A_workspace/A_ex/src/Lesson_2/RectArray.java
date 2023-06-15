package Lesson_2;

import java.util.Scanner;

class Rect{
	private int width,height; //높이와 너비를 정수형으로 받는 변수 선언
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {//사각형 면적 계산 메서드
		return width * height; //사각형 면적 계산
	}
}


public class RectArray {

	public static void main(String[] args) {
		//사각형을 표현하는 다음 Rect클래스를 활용하여, Rect객체 배열을 생성하고,
		//사용자로부터 4개의 사각형을 입력받아 배열에 저장한 뒤, 배열을 검색하여
		//사각형 면적의 합을 출력하는 main()메서드를 가진 RectArrat 클래스 작성
		Scanner sc = new Scanner(System.in);
		
		Rect[] ar = new Rect[4];
		int sum = 0;
		
		for(int i=0;i<4;i++) {
			System.out.print((i+1)+"번째 사각형의 너비와 높이 입력 = ");
			ar[i] = new Rect(sc.nextInt(), sc.nextInt());
			
			sum += ar[i].getArea();
		}
		System.out.println("저장하였습니다...\n");
		
		System.out.print("4개 사각형 면적은 전체 총합은 = "+sum+" 입니다.");
	}

}
