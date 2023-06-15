package Lesson_1;

public class Lesson4 {

	public static void main(String[] args) {
		//1부터 99까지, 369게임에서 박수를 쳐야 하는 경우
		//순서대로 화면 출력 프로그램
		
		System.out.println("☆★☆★☆★369게임 시작☆★☆★☆★");
		
		for(int i = 0; i <= 99; i++) {
			int one = i/10; //10,20,30,40..90까지 저장, 즉 10의 자리
			int two = i%10; //10으로 나눈 나머지들 즉 1의 자리
			
			if(one==0&&two%3==0)
			//10,20,30,40이면서 1의 자리 숫자가 3으로 나누어 떨어지는 경우
			//13,16,19,23,26,29...99까지
				System.out.println(i + " 박수 짝");
				//i(숫자)와 함께 박수를 출력
			else if(one%3!=0&&two%3==0&&two!=0)
			//10의 자리 숫자가 30,60,90이 아니며,
			//1의 자리 숫자가 0이 아니고 3,6,9인 경우
			//1의 자리 숫자만 해당되므로 박수 한번
				System.out.println(i + " 박수 짝");
			else if(one%3==0&&two==0)
			//30,60,90인 경우 
				System.out.println(i + " 박수 짝");
			else if(one%3==0&&two%3==0)
				System.out.println(i + " 박수 짝짝");
		}
		System.out.println("☆★☆★☆★369게임 끝☆★☆★☆★");
	}

}
