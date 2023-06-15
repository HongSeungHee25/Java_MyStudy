package day06;

public class ForEachTest {

	public static void main(String[] args) {
		
		String[] ar = {"홍길동","서길동","김길동"};
		
		//일반 for문
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//for-each문
		
		for(String name:ar) {
			System.out.println(name);
		}
		
		int[] ar2= {1,2,3,4,5};
		
		for (int i : ar2) {
			System.out.println(i);
		}
	}

}
