package review;

public class Student {

	//정보 은닉을 위해 접근 권한 제어자를 private로 부여한다
	private String name;
	private int studentNumber;
	private String gender;
	
	public Student() {;}
	
	//필드를 접근하기 위해 메서드를 사용하자
	//getter : get + 필드명
	//setter : set + 필드명

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
