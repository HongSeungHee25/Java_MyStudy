package object;

public class EqualsTest {

	public static void main(String[] args) {

		//String 클래스에서는 equals() 메서드를 재정의 해놨다
		System.out.println("A"=="A");
		System.out.println("A".equals("A"));
		
		String msg = "hello";
		String msg2 = "hello";
		
		String msg3 = new String("hello");
		
		System.out.println(msg == msg2);
		System.out.println(msg.equals(msg2));
		
		System.out.println(msg == msg3);
		System.out.println(msg.equals(msg3));
		
		
		OldUser olduser1 = new OldUser("min","min1234");
		OldUser olduser2 = new OldUser("kim","kim1234");
		
		//Object 클래스의 equals() 메서드는 == 와 같다
		//주소값을 비교한다
		System.out.println(olduser1 == olduser2);
		System.out.println(olduser1.equals(olduser2));
		
	}

}
