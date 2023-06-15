package day08;

public class Student {

	//field
	String name;
	int age;
	String gender;
	String subject;
	
	Student student;
	
	public Student() {;} //{;} : 수정하지마
	
	public Student(String subject) {
		this.subject = subject;
		System.out.println("생성자1 호출");
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String gender, String subject, Student student) {
		
		this(subject);
		this.gender = gender;
		this.subject = subject;
		this.student = student;
		System.out.println("생성자2 호출");
	}

	//method
	
	void goToScool() {
		System.out.println("학원 등원 합니다");
	}
	
	void study() {
		System.out.println("학원에서 공부합니다");
	}
	
	void checkIn() {
		String name = "kim";
		System.out.println(name+"님 학원 등원!");//지역변수 name
		System.out.println(this.name+"님 학원 등원!");//전역변수 name(field)
	}

	}


