package ex1;

public class Fruit {

	public static void main(String[] args) {
		//문제1.
		//배,사과,오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5,6,7개
		//1. 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		//2. 시간당 과일의 생산 갯수를 출력
		
		int pear = 5;
		int apple = 6;
		int orange = 7;
		
		int total = pear + apple + orange;
		float avg = total / 24f;
		
		System.out.println("하루에 생산되는 과일의 총 갯수 : "+total+"개");
		System.out.println("시간당 생산 갯수 : "+avg+"개");
	}

}
