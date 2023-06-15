package day04;

public class Oper4 {

	public static void main(String[] args) {
		
		//비트 연산자
		
		System.out.println("십진수 : "+10+" 이진수 : "+Integer.toBinaryString(10));
		System.out.println("십진수 : "+11+" 이진수 : "+Integer.toBinaryString(11));
		
		//&(AND) 논리곱 두 비트가 모두 1이면 1
		
		System.out.println(10&11);
		System.out.println("이진수 : "+Integer.toBinaryString(10&11));
		
		//|(OR) 논리합 두 비트중 하나라도 1이면 1
		System.out.println(10|11);
		System.out.println("이진수 : "+Integer.toBinaryString(10|11));
		
		//^(XOR) 베타논리합 두비트가 서로 다르면 1
		
		System.out.println(10^11);
		System.out.println("이진수 : "+Integer.toBinaryString(10^11));
		
		//~(NOT) 논리부정 0을 1로,1을 0으로
		System.out.println(~10);
		System.out.println("이진수 : "+Integer.toBinaryString(~10));
		
		//쉬프트 연산자
		System.out.println(10>>1);
		System.out.println("이진수 : "+Integer.toBinaryString(10>>1));
		System.out.println(10<<1);
		System.out.println("이진수 : "+Integer.toBinaryString(10<<1));
	}

}
