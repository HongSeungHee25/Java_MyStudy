package day08;

import java.util.Scanner;

public class ClassTest2 {

	public static void main(String[] args) {
		
		//Student 클래스를 통해 객체를 생성한다(객체화)
		
		//클래스명 객체명 = new 클래스명();
		
		Student student1 = new Student();
		
		Student student2 = new Student("java");
		Student student3 = new Student("java");
		
		System.out.println(student2.subject);
		
		//학생에게 이름과 나이를 물어보고 필드에 저장한다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름이 무엇인가요?");
		student2.name = sc.next();
		System.out.println("나이가 몇살인가요?");
		student2.age = sc.nextInt();
		
		System.out.println(student2.name+"님 학원 등원 완료!");
		
		Student student4 = new Student("min", 24, "여성", "java", student3);
		
		System.out.println(student4);
		
		student4.checkIn();
	}

}
