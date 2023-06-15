package Lesson;

import java.util.Scanner;

public class Lesson8 {

	public static void main(String[] args) {
		//음료의 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피를 주문하세요>>");
		String coffee = sc.next(); //커피 주문
		int num = sc.nextInt(); //커피 주문 수량
		
		if(coffee.equals("에스프레소")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2000;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("아메리카노")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2500;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("카라멜마끼아또")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 4500;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("카푸치노")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 3000;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("카페라떼")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 3800;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("아샷추")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 3500;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("딸기스무디")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 4800;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("요거트스무디")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 4000;
			System.out.println("가격은 "+num+"원 입니다.");
		}else if(coffee.equals("커피스무디")) {
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 4500;
			System.out.println("가격은 "+num+"원 입니다.");
		}else {
			System.out.println("주문하신 메뉴는 없는 메뉴입니다.");
		}
	}

}
