package day04;

public class SwitchTest {

	public static void main(String[] args) {
		
		
		int num=10;
		
		//if문
		if(num==10) {
			System.out.println("일치합니다");
		}
		
		//switch문
		switch(num) {
		case 10: case 2:
			System.out.println("일치합니다");
			break;
		case 11:
			System.out.println("일치하지 않습니다");
			break;
		default:
			System.out.println("아무것도 일치하지 않습니다");
			break;
		}
	}

}
