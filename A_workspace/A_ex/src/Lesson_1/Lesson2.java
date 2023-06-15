package Lesson_1;

import java.util.Scanner;

public class Lesson2 {
	public static void main(String[] args) {
		//정수를 10개 입력받아 배열에 저장한 후,
		//배열을 검색하여 3의 배수만 골라 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int ar[] = new int[10];
		int i;
		
		System.out.println("정수 10개를 입력하세요>>");
		
		for (i = 0; i < ar.length; i++) {
			//ar의 길이는 10개이므로 10번 반복
			ar[i] = sc.nextInt();
		}//입력을 받아 배열에 저장하는  반복문
		System.out.print("입력한 정수 중 3의 배수는 = ");
		for(i=0; i<ar.length;i++) {
			if(ar[i]%3==0)
			//ar배열의 i원소를 3으로 나누었을때 나머지가 0인 것이 3의 배수인 것
				System.out.print(ar[i]+" ");
			//입력받은 배열에서 3의 배수를 if조건문을 활용하여 검색,출력하는 반복문
		}
	}
}
