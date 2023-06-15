package wrapper;

public class StringTest {

	public static void main(String[] args) {
		
		//String 클래스 메서드
		
		String msg = "안녕하세요";
		
		//chatAt()
		
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(1));
		
		//indexOf()-> 찾는 문자열이 존재하지 않을경우 -1로 리턴한다
		System.out.println(msg.indexOf("안"));
		System.out.println(msg.indexOf("하"));
		System.out.println(msg.indexOf("HH"));
		
		//split()
		String msg2 = "안!녕!하!세!요";
		String[] ar = msg2.split("!");
		for(String string : ar) {
			System.out.println(string);
		}
		
		//substring(start, end) -> start 부터 end -1까지
		System.out.println(msg2.substring(0,3));
		String msg3 = msg2.substring(0,3);
		System.out.println(msg3);
		
		//length()
		System.out.println(msg2.length());
		
		//contains()
		String msg5 = "안녕하세요";
		System.out.println(msg5.contains("안녕"));
		
		//문자열에서 연결작업을 반복적으로 해야하는 경우
		
		long startTime = System.nanoTime();
		
		String msg6 = "";
		for (int i = 0; i < 100; i++) {
			msg6 += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("소요시간 = "+(endTime - startTime));
		
		//StringBuffer, StringBuilder
		
		String test = "test";
		String test2 = test + "A";
		
		long startTime2 = System.nanoTime();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		
		long endTime2 = System.nanoTime();
		
		System.out.println("소요시간 = "+(endTime2 - startTime2));
	}

}
