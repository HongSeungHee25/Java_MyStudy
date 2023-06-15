package day03;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//	    String msg = sc.next();
//		System.out.println(msg+"님 안녕하세요");
		
		// ctrl + shift + o : 자동 import(불러오기)
		Scanner sc = new Scanner(System.in);
		String fullName = null;
		String firstName = null;
		String lastName = null;
		
		
		System.out.println("이름을 입력하세요");
//		fullName = sc.next();
		lastName = sc.next();
		firstName = sc.next();
		
//		fullName = sc.nextLine();
//		System.out.println(fullName+"님 안녕하세요");
		System.out.println(lastName+firstName+"님 안녕하세요");
		
	}

}
