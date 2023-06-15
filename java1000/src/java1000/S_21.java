package java1000;

import java.util.Arrays;
import java.util.Scanner;

public class S_21 {

	public static int generateNumber() {
		return(int)(Math.random()*45)+1;
	}
	
	public static void main(String[] args) {
		//로또 번호 생성기
		//중복 숫자가 없도록 할 것.
		//싫어하는 숫자 5개를 입력받고 이를 제외하여 번호를 생성할 것.
		//최종적으로 생성된 번호들을 정렬하여 출력 할 것.
		
		Scanner sc = new Scanner(System.in);
		int[] hateNumbers = new int[5];
		
		System.out.println("제외할 번호 5개를 입력하세요>>");
		for(int i = 0; i < hateNumbers.length; i++) {
			hateNumbers[i] = sc.nextInt();
		}
		
		int[] lottoNumbers = new int[6];
		int index = 0;
		boolean duplicate;
		
		while(index < lottoNumbers.length) {
			int number = generateNumber();
			duplicate = false;
			
			for(int i = 0; i < hateNumbers.length; i++) {
				if(number == hateNumbers[i]) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				lottoNumbers[index++] = number;
			}
		}
		
		Arrays.sort(lottoNumbers);
		
		System.out.print("생성된 로또 번호 : ");
		for(int number : lottoNumbers) {
			System.out.print(number+" ");
		}
	}

}
