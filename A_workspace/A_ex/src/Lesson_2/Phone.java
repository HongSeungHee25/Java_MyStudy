package Lesson_2;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	private String getName() {
		return name;
	}
	private String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		//이름(name 필드)과 전화번호(tel 필드)를 가진 Phone클래스이다.
		//이름과 전화번호를 입력받아 2개의 Phone 객체를 생성하고,
		//출력하는 main()메서드 작성하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 전화번호 입력>>");
		Phone one = new Phone(sc.next(), sc.next());
		
		System.out.print("이름과 전화번호 입력>>");
		Phone two = new Phone(sc.next(), sc.next());
		
		System.out.println(one.getName()+"의 번호 "+one.getTel());
		System.out.println(two.getName()+"의 번호 "+two.getTel());
	}

}
