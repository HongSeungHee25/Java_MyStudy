package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random = new Random(); // seed: 현재시간
		Random random2 = new Random(2); // seed: 2
		Random random3 = new Random(2); // seed: 2
		
		
		for(int i=0;i<5;i++) {
			System.out.println("기본 생성지:"+random.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("random2:"+i+"번째 값:"+random2.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("random3:"+i+"번째 값:"+random3.nextInt());
			
		}
	}

}
