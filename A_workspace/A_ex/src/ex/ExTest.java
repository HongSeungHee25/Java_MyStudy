package ex;

public class ExTest {
//선언
	public void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	public static void multi(int x,int y) {
		System.out.println(x*y);
	}
//사용
	public static void main(String[] args) {
		ExTest print = new ExTest();
		print.print();
//		System.out.println(multi(7,8));
		multi(7,8);
		multi(999,123456);
	}

}
