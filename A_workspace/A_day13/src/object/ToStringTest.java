package object;

public class ToStringTest {

	public static void main(String[] args) {
		
		//재정의 한것
		User user1 = new User("Kim","Kim1234");
		
		//아래 코드는 같은 코드이다 
		System.out.println(user1);
		System.out.println(user1.toString());
		
		//재정의 한것
		User user2 = new User("Hong","Hong1234");
		
		//아래 코드는 같은 코드이다 
		System.out.println(user2);
		System.out.println(user2.toString());
		
		//재정의 안한것
		OldUser olduser1 = new OldUser("Min","Min1234");
		System.out.println(olduser1);
	}

}
