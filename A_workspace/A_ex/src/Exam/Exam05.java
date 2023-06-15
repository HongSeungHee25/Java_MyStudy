package Exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//은행 ATM 프로그램
		boolean run = true;
		int deposit = 0; //예금
		int withdrow = 0; //출금
		int balance = 0; //잔고
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>>");
			int choice = sc.nextInt();
			
			if(choice==1) {//예금
				System.out.print("예금액>>");
				deposit = sc.nextInt();
				balance += deposit; //입력된 예금액을 잔고에 더해준다.
			}else if(choice==2) {//출금
				System.out.print("출금액>>");
				withdrow = sc.nextInt();
				if(balance - withdrow < 0) {//예금액-출금액이 음수일 경우
					int insuf = balance - withdrow; //int insuf 잔고 부족금액 변수
					System.out.printf("잔고 부족\n부족 금액 : %d원\n",-insuf);
				}else {
					balance-=withdrow; //입력된 출금액을 잔고에서 빼준다.
				}
			}else if(choice==3) {//잔고
				System.out.println("잔고>>"+balance);//예금과 출금을 계산하고 난 잔고를 출력한다.
			}else {
				break;
			}
		}
		sc.close();
		System.out.printf("\n프로그램 종료");
	}

}
