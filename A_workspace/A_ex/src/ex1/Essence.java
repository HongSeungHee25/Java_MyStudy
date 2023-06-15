package ex1;

public class Essence {

	public static void main(String[] args) {
		
		//변수 n에 정수값을 저장하고 1부터 입력받은 정수 n까지의
		//합을 계산하여 그 결과를 출력하는 프로그램
		
		int result = 0;
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println("결과 : "+result);
	}

}
