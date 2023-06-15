package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat
		System.out.println(str.concat("world!"));
		System.out.println(str);
		//substring(시작위치,끝위치):시작위치~끝위치전까지 가져온다
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(3));
		//length
		System.out.println(str.length());
		//toUppercase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		
		//charAt(인덱스),indexOf(문자열),equals(문자열)
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("o"));//-1:못찾음
		System.out.println(str.equals("hello"));
		
		//trim(),replace,replaceAll
		System.out.println("test".trim());
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replace("hello", "bye"));

}
}