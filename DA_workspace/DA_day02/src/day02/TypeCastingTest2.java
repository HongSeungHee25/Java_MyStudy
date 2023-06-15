package day02;

public class TypeCastingTest2 {

	public static void main(String[] args) {

		// 문자열 형변환

		int num = 10;
		String strNum = 10 + "";

		System.out.println(num);
		System.out.println(strNum);

		double num2 = 10.7;
		String strDouble = num2 + "";
		System.out.println(strDouble);

		System.out.println(strNum + strDouble);

		// 문자열 -> 다른 자료형

		int intVar = Integer.parseInt("10");
		double dobuleVar = Double.parseDouble("10.7");
		boolean boolVar = Boolean.parseBoolean("true");

		// charAt(자리번호) 자리번호는 0부터 시작한다
		char spell = "hello".charAt(0);
		char spell2 = "hello".charAt(1);

		System.out.println(spell);
		System.out.println(spell2);

	}

}
