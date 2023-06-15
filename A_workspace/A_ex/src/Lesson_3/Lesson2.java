package Lesson_3;

public class Lesson2 {

	public static void main(String[] args) {
		//2진수의 연산을 프로그래밍 하기
		//(한 값과 그 값의 2의 보수 값을 더했을때 0이 되는지 확인하기)
		
		int num1 = 0B00000000000000000000000000000101; 
		//5(32자리를 표현하고자함)
		int num2 = 0B11111111111111111111111111111011;
		//본래 끝이 010 이지만 1을 더해줬으므로 011로 맺음 = -5
		
		int sum = num1 + num2;
		System.out.println(num1+"와 "+num2+"를 더하면 "+sum+"이 된다.");
	}

}
