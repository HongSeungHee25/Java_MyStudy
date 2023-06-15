package ex;

public class ForEx1 {

	public static void main(String[] args) {
		//for문으로 구구단 만들기
		for(int i=2;i<=9;i++) {
			System.out.println("===="+i+"단====");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		
	}

}
