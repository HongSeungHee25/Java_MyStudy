package Lesson;

import java.util.Scanner;

public class Lesson10 {

	public static void main(String[] args) {
		//Lesson8프로그램 변형 -> 10잔 이상 주문하면
		//가격의 5% 할인해준다
Scanner sc = new Scanner(System.in);
		
		System.out.print("커피를 주문하세요(10잔 주문시 5%할인 적용)>>");
		String coffee = sc.next(); //커피 주문
		int num = sc.nextInt(); //커피 주문 수량
		
		if(coffee.equals("에스프레소")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 2000 - (2000 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("에스프레소")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 2000;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("아메리카노")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 2500 - (2500 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("아메리카노")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 2500;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("카라멜마끼아또")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4500 - (4500 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("카라멜마끼아또")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4500;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("카푸치노")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3000 - (3000 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("카푸치노")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3000;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("카페라떼")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3800 - (3800 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("카페라떼")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3800;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("아샷추")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3500 - (3500 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("아샷추")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 3500;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("딸기스무디")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4800 - (4800 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("딸기스무디")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4800;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("요거트스무디")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4000 - (4000 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("요거트스무디")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4000;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else if(coffee.equals("커피스무디")&& num > 9) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4500 - (4500 * 5/100); //5%할인 수식
			System.out.println("가격은 5% 할인되어 "+num+"원 입니다.");
		}else if(coffee.equals("커피스무디")) {
			System.out.println("주문하신 커피는 "+coffee+" "+num+"잔이며,");
			num *= 4500;
			System.out.println("가격은 "+num+"원 입니다.");
			
		}else {
			System.out.println("주문하신 메뉴는 없는 메뉴입니다.");
		}
	}

}

	


