package ex1;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		//1~45사이의 난수를 발생시켜 lotto 배열에 담아,
		//번호를 생성하는 프로그램(중복불가 X)
		
		int[] lotto = new int[6];
		
		outer : for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45) + 1; //1~45사이의 난수
			
			//중복체크(경우의 수)
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(lotto[i] + " ");
			
			i++;
		}
	}

}
