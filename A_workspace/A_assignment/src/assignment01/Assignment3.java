package assignment01;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		// 과제1. (for문 사용)
				// 사용자로부터 정수를 입력받고 1부터 입력한 정수까지 중에서 홀수의 합계를 구하기
				Scanner sc = new Scanner(System.in);
				int num = 0;
				
				System.out.println("정수를 입력하세요>>");
				num = sc.nextInt();
				for(int i=1;i<=num;i++) {
					if(i%2 != 0) {
						num += i;
					}
				System.out.println("1부터 입력한 중 홀수의 총 합계:"+num);
				}
				// 과제2. 심화 (for문 사용)
				// for문을 이용하여 아래와 같이 출력하기		
				//1		짝수	3	짝수	5	짝수	7	짝수	9	짝수
				//11	짝수	13	짝수	15	짝수	17	짝수	19	짝수
				//21	짝수	23	짝수	25	짝수	27	짝수	29	짝수
				//31	짝수	33	짝수	35	짝수	37	짝수	39	짝수
				//41	짝수	43	짝수	45	짝수	47	짝수	49	짝수
				String even = "";
				for(int i=0; i<=50; i++) {
					for(int j=i; j<=10; j++) {
					if(i%2 == 0) {
						even = "짝수";
					}else {
						System.out.print(j+i+even+" ");
					}
				}
				}
				// 과제3. (배열 사용)
				// 주어진 코드를 완성하여 사용자가 입력한 점수를 5칸짜리 배열에 담고 평균 점수와 합계 점수를 구해서 출력하기

				Scanner sc1 = new Scanner(System.in);
				int[] score = new int[5];

				for (int i = 0; i < score.length; i++) {
					System.out.println("점수를 입력하세요");
				}
				

				System.out.println("합계 점수:");
				System.out.println("평균 점수:");

				// 과제4. (배열 사용)
				// 사용자에게 아이디를 입력받고 중복된 아이디인지 확인하여 출력하기
				// 단, for-each문을 사용할것

				String[] userList = { "min123", "kim123", "seo123" };

				// 과제5. (배열 사용)
				// 아래와 같은 10칸짜리 정수형 배열이 존재합니다
				// 지뢰가 없는 칸은 0이 들어가 있고 지뢰가 있는 칸은 2라는 값이 들어가 있습니다
				// 사용자에게 어떤 칸을 열어볼지 지뢰를 찾을때까지 계속 물어봅니다
				// 사용자에게 열어볼 칸을 물어보고 지뢰가 없다면 1이라는 값을 넣습니다
				// 만약 이미 열어볼 칸을 다시 입력하면 이미 탐색한 구역이라고 출력하기
				// 사용자에게 열어볼 칸을 물어보고 지뢰가 있으면 지뢰를 찾았다고 출력하고 프로그램 종료라고 출력하고 종료

				int[] bombBox = { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0 };

			
		
	

}}
