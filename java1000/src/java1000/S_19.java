package java1000;

public class S_19 {

	public static int sum(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//배열의 합 구하기
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}
		System.out.printf("총합 : %d\n",sum(arr));
	}

}
