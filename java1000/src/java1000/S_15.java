package java1000;

import java.util.Scanner;

public class S_15 {

	public static void printPay(double basePay, int hours) {
		final double MINIMUM_WAGE = 9620.0; //최저시급 상수
		final int MAX_HOURS = 60; //제한 근무시간 상수
		final int REGULAR_HOURS = 40; //주당 근무시간 
		final double OVERTIME_RATE = 1.5; //주당 근무시간 40시간 초과시 1.5배
		
		if(basePay < MINIMUM_WAGE) {//최저시급 불이행 체크
			System.out.println("ERROR : 최저시급 불이행");
			return;
		}if(hours > MAX_HOURS) {//제한 근무시간 초과 체크
			System.out.println("ERROR : 제한 근무시간 초과");
			return;
		}
		double pay = 0.0;
		if(hours <= REGULAR_HOURS) {//주당 근무시간 40시간 이하인 경우
			pay = basePay * hours;
		}else {//주당 근무시간 40시간을 초과하는 경우
			int overtimeHours = hours - REGULAR_HOURS; //초과시간
			pay = REGULAR_HOURS * basePay + overtimeHours * basePay * OVERTIME_RATE; //초과급여 포함하여 계산 
		}
		System.out.printf("근무시간 : %d시간, 기본시급 : %.2f원, 총 임급 : %.2f원\n",hours, basePay, pay); //소수점 두 자리까지 출력
	}
	
	public static void main(String[] args) {
		//임금 계산하기
		//직원 임금은 주금으로 정산하며, (근무시간)x(기본시급) 기준
		//주당 근무시간 40시간 초과시, 초과급여는 (초과시간)x(기본시급)x(1.5)
		//기본시급은 최저 9620원 이며, 이보다 작을 경우 에러를 출력한다.
		//주당 근무시간이 60시간을 초과하는 경우 에러를 출력한다.
		//출력 ex) 
		//ERROR : 최저시급 불이행
		//ERROR : 제한 근무시간 초과
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기본 시급을 입력하세요>>");
		double basePay = sc.nextDouble();
		
		System.out.print("총 근무시간을 입력하세요>>");
		int hours = sc.nextInt();
		
		printPay(basePay,hours);
	}

}
