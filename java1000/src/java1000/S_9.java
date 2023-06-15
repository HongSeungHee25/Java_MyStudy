package java1000;

public class S_9 {

	public static void main(String[] args) {
		//자유낙하 물체의 고도 구하기
		double g = -9.81; //중력 가속도(m/s^2)
		double t = 5.0; //시간 (s)
		double h = 0.5 * g * Math.pow(t, 2); //고도 (m)
		System.out.println("고도 : "+h+"m");
		
	}

}
