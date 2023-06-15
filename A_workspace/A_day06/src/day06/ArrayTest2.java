package day06;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//실습1(어떤값이 들어갈지 모를때)
		
		//double 타입의 2칸짜리 빈 배열 선언 arDouble
		//char 타입의 5칸짜리 빈 배열 선언 arChar
		//String 타입의 3칸짜리 빈 배열 선언 arString
		//boolean 타입의 2칸짜리 빈 배열 선언 arBool
		
		//double 타입의 2칸짜리 배열 반복문을 통해 출력
		//char 타입의 5칸짜리 배열 반복문을 통해 출력
		//String 타입의 3칸짜리 배열 반복문을 통해 출력
		//boolean 타입의 2칸짜리 배열 반복문을 통해 출력
		
		//자료형[] 배열명 = new 자료형[칸수];
		
		double[] ardouble=new double[2];
		
		for (int i = 0; i < ardouble.length; i++) {
			System.out.println(ardouble[i]);
		}
		
		char[] archar=new char[5];
		
		for (int i = 0; i < archar.length; i++) {
			System.out.println(archar[i]);
		}
		
		String[] arString=new String[3];
		
		for (int i = 0; i < arString.length; i++) {
			System.out.println(arString[i]);
		}
		
		boolean[] arbool=new boolean[2];
		
		for (int i = 0; i < arbool.length; i++) {
			System.out.println(arbool[i]);
		}
		
		//실습2(반복문 for문 사용)
		//위에서 만든 각각의 배열에 값을 저장하기
		
		//arDouble -> i* 10
		//arChar -> 'A'
		//arString -> i의 값을 문자열로 변환해서
		//arBool -> true
		
		for (int i = 0; i < ardouble.length; i++) {
			ardouble[i]=i*10;
			System.out.println(ardouble[i]);
		}
		
		for (int i = 0; i < archar.length; i++) {
			archar[i]='A';
			System.out.println(archar[i]);
		}
		
		for (int i = 0; i < arString.length; i++) {
			arString[i]=i + "";
			System.out.println(arString[i]);
		}
		
		for (int i = 0; i < arbool.length; i++) {
			arbool[i]=true;
			System.out.println(arbool[i]);
		}
	}

}
