package ex;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		//이름 입력받기
		//점수 입력받기
		//점수가 80점이하면 불합격
		//점수가 80점이거나 이상이면 합격
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int num = 0;
		System.out.println("이름을 입력하세요>>");
		name = sc.next();
		System.out.println("점수를 입력하세요>>");
		num = sc.nextInt();
		if(num>=80) {
			System.out.println(name+"님은 합격입니다");
		}else {
			System.out.println(name+"님은 불합격입니다");
		}
		
		
		
		
		
	}

}
