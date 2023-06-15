package Lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {
		//컴퓨터와 사용자의 가위바위보 게임 프로그램
		//컴퓨터는 랜덤하게 가위,바위,보를 선택하며
		//누가 이겼는지 출력. "그만"을 입력하면 게임 종료
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		String game[] = {"가위","바위","보"};
		
		System.out.println("컴퓨터와 가위바위보 게임을 시작합니다.");
		
		while(true) {
			System.out.print("가위,바위,보! = ");
			String me = sc.nextLine();
			
			int computer = random.nextInt(3);
			
			if(me.equals("가위")) {//가위를 내면
				if(computer == 0) {//0을 가위라고 가정한다.
					System.out.println("사용자 = 가위, 컴퓨터 = 가위,\n비겼습니다..");
				}else if(computer == 1) {//1을 바위라고 가정한다.
					System.out.println("사용자 = 가위, 컴퓨터 = 바위,\n졌습니다T.T");
				}else if(computer == 2) {//2를 보라고 가정한다.
					System.out.println("사용자 = 가위, 컴퓨터 = 보,\n이겼습니다:D");
				}
			}else if(me.equals("바위")) {
				if(computer == 0) {
					System.out.println("사용자 = 바위, 컴퓨터 = 가위,\n이겼습니다:D");
				}else if(computer == 1) {
					System.out.println("사용자 = 바위, 컴퓨터 = 바위,\n비겼습니다..");
				}else if(computer == 2) {
					System.out.println("사용자 = 바위, 컴퓨터 = 보,\n졌습니다T.T");
				}
			}else if(me.equals("보")) {
				if(computer == 0) {
					System.out.println("사용자 = 보, 컴퓨터 = 가위,\n졌습니다T.T");
				}else if(computer == 1) {
					System.out.println("사용자 = 보, 컴퓨터 = 바위,\n이겼습니다:D");
				}else if(computer == 2) {
					System.out.println("사용자 = 보, 컴퓨터 = 보,\n비겼습니다..");
				}
			}else if(me.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				sc.close();
				System.exit(0);
			}else 
				System.out.println("가위,바위,보 중에서 하나를 입력하세요.('그만'을 입력하시면 게임을 종료합니다.)");
			
		}
	}

}
