package day07;

public class MethodTest3 {

	void printData(int data) {
		System.out.println("정수형 = "+data);
	}
	void printData(int data, int data2) {
		System.out.println("정수형 = "+data);
	}
	void printData(double data) {
		System.out.println("실수형 = "+data);
	}
	
	void printData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	int[] changeData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] = 20);
		}return ar;
	}
	void printData(int num, String msg) {
		for (int j = 0; j < num; j++) {
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		
		MethodTest3 mt = new MethodTest3();
		
		//메서드 오버로딩
		
		mt.printData(10);
		mt.printData(10.0);
		
		System.out.println(1);
		System.out.println(10.0);
		System.out.println(true);
		System.out.println("hello");
		
		//매개변수 : 배열
		int[] ar = {1,2,3,4,5};
		mt.printData(ar);
		
		//매개변수 : 정수형, 문자열
		mt.printData(2, "안녕하세요");
		
		//여러개의 타입의 자료형이 있다면 순서를 일치시켜야 한다
		//mt.printData("안녕하세요", 2);
	}

}
