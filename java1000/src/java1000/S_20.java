package java1000;

import java.util.Scanner;

public class S_20 {

	public static void main(String[] args) {
		//모음과 자음의 개수
		//A,E,I,O,U를 모음이라고 가정했을때, 입력으로 들어온 문자열이 
		//몇개의 모음과 자음으로 구성되어 있는지 출력하는 프로그램
		//for문과 switch 구문을 사용하여 모음과 자음의 개수를 세어주세요
		
		//입력 예) 입력할 문자열을 정수로 입력해주세요>> 2
		//Programming is fun // 입력한 문자열 1
		//Hello World // 입력한 문자열 2
		
		//출력 예) 
		//Programming is fun: 5,11
		//Hello World: 3,7
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 문자열을 정수로 입력해주세요>>");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		System.out.println("문자열을 입력해주세요>>");
		String str = sc.next();
		
		int vowelCount = 0; //모음 개수
		int consonantCount = 0; //자음 개수
		
		for(int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'O':
			case 'I':
			case 'U':
				vowelCount++;
				break;
			case ' ':
				break;
			default:
					consonantCount++;
			}
		}
		System.out.printf("%s : %d, %d\n",str, vowelCount,consonantCount);
	}
	}
}

