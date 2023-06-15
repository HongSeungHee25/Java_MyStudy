package Lesson_2;

import java.util.Scanner;

class Phone2{
	private String name,tel;
	
	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class PhoneManage {

	public static void main(String[] args) {
		//이름(name)과 전화번호(tel) 필드, 생성자 및 필요한 메서드를 가진
		//Phone 클래스를 작성하고, 저장할수 있는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수를 입력하세요 = ");
		int Person = sc.nextInt();
		
		Phone2[] ar = new Phone2[Person];
		
		for(int i=0;i<Person;i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			ar[i] = new Phone2(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다.");
		
		label : while(true) {
			System.out.print("\n"+"검색할 이름>>");
			String yourname = sc.next();
			
			for(int i=0;i<Person;i++) {
				if(yourname.equals("종료")) {
					System.out.print("프로그램을 종료합니다.");
					sc.close();
					System.exit(0);
				}else if(yourname.equals(ar[i].getName())) {
					System.out.println(ar[i].getName()+"의 번호는 = "+ar[i].getTel()+"입니다.");
				}else if(yourname != ar[i].getName()) {
					System.out.println(yourname + "님의 정보가 없습니다.");
				}
			}
		}
	}

}
