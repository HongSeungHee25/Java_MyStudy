package java1000;

public class S_8 {

	public static void main(String[] args) {
		//각 자리수의 합구하기
		int num = 12345;
		int sum = 0 ;
		
		while (num>0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("각 자리수의 합 : "+sum);
		
	}

}
