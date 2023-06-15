package api;

import java.util.Random;

public class ApiTest1 {

	public static void main(String[] args) {

		//내부 API
		//Random 클래스
		
		Random random = new Random();
		
		int num = random.nextInt();
		System.out.println(num);
		
		//0보다 큰 n 미만의 랜덤한 정수를 리턴한다
		int num2 = random.nextInt(10);
		System.out.println(num2);
		
		//1~5까지 중에서 랜덤한 정수
		int num3 = random.nextInt(5) + 1;
		System.out.println(num3);
		
		//Math 클래스
		
		//ceil() 올림
		System.out.println(Math.ceil(9.1));
	
		//floor() 내림
		System.out.println(Math.floor(9.7));
		
		//round() 소수점 첫째자리에서 반올림
		System.out.println(Math.round(9.7));
	
	}
	

}
