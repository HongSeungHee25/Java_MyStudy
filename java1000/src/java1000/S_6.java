package java1000;

import java.util.Scanner;

public class S_6 {

	public static void main(String[] args) {
		//급여 계산기
		Scanner sc = new Scanner(System.in);
		System.out.print("시급을 입력해주세요>>");
		int basepay = sc.nextInt();
		System.out.print("총 업무시간을 입력해주세요>>");
		int workingHours = sc.nextInt();
		
		int pay = basepay*workingHours;
		
		System.out.println("총 월급은 "+pay+"원 입니다.");
	}

}
