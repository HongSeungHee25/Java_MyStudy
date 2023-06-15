package Exam1;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		//ex)9,480원 어치 물건을 사고 10,000원을 지불했을 때의 거스름돈과
		//1000원,500원,100원,50원,10원의 개수를 출력하는 프로그램
		//물건값과 거스름돈은 입력할 수 있어야 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력하세요 : ");
		int cost = sc.nextInt();
		System.out.print("지불할 돈의 액수를 입력하세요 : ");
		int pay = sc.nextInt();
		sc.close();
		
		int change = pay - cost;
		if(change>=0) {
			System.out.printf("거스름돈 : %,d원\n",change);
			
			System.out.printf("50,000원 : %d개\n",change/50000);
			System.out.printf("10,000원 : %d개\n",(change%50000)/10000);
			System.out.printf("1,000원 : %d개\n",((change%50000)%10000)/1000);
			System.out.printf("500원 : %d개\n",(((change%50000)%10000)%1000)/500);
			System.out.printf("100원 : %d개\n",((((change%50000)%10000)%1000)%500)/100);
			System.out.printf("50원 : %d개\n",(((((change%50000)%10000)%1000)%500)%100)/50);
			System.out.printf("10원 : %d개\n",((((((change%50000)%10000)%1000)%500)%100)%50)/10);
		}else {
			System.out.printf("%d원이 부족합니다.",-change);
		}
	}

}
