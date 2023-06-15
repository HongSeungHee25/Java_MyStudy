package day05;

public class LoopTest {

	public static void main(String[] args) {

		
		//break
		for (int i = 0; i < 5; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			if(i==3) {
				break;
			}
		}
		int num = 0;
		while(num<5) {
			if(num==3) {
				break;
			}
			System.out.println(num);
			num++;
		}
		//continue
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3) {
				continue;
			}
		}
	}

}