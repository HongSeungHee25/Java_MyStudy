package ex;

public class ForEx3 {

	public static void main(String[] args) {
		//1~10까지 숫자의 합계구하기
		int x=0;
		for(int i=1;i<=10;i++) {
			x+=i;
		}System.out.println("1~10까지의 합계는?\n"+x+"입니다");
		
		//1~10까지 홀수값의 합계구하기
		int y=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				y+=i;
			}
		}System.out.println("1~10사이의 홀수의 합계는?\n"+y+"입니다");
		
		//1~10까지 짝수값의 합계구하기
		int z=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				z+=i;
			}
		}System.out.println("1~10사이의 짝수의 합계는?\n"+z+"입니다");
		
		//구구단 만들기
		for(int i=2;i<=9;i++) {
			System.out.println("===="+i+"단====");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		
		
		
		
		
	}
}
