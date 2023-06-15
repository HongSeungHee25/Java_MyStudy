package day03;

public class Oper2 {

	public static void main(String[] args) {
		
		//관계 연산자
		System.out.println("관계연산자===============");
		
		System.out.println(1==3);
		System.out.println(1!=3);
		System.out.println(1>3);
		System.out.println(1<3);
		System.out.println(1>=3);
		System.out.println(1<=3);
		
		//문자열은 equals() 메서드를 사용한다
		System.out.println(!"min".equals("B"));
		
		//논리 연산자
		System.out.println("논리연산자===============");
		
		System.out.println((1==3) && (2==5));
		System.out.println((1==3) || (2==5));
		
//		System.out.println(10<20<30);
		System.out.println(10<20 && 20<30);
		
		System.out.println(true && true);
		System.out.println(true || false);
		
		//대입 연산자
		//복합 대입 연산자
		System.out.println("대입연산자===============");
		
		int num=10;
		num++;
		//num=num+1
		
		num += 10;
		//num=num+10
		
		num -= 10;
		//num=num-10
		
		num *= 10;
		//num=num*10
		
		num /= 10;
		//num=num/10
		
		num %= 10;
		//num=num%10
				
	}

}
