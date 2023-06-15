package access1;

public class AccessTest3 {

	public static void main(String[] args) {
		
		User user = new User("min","min1234");
//		System.out.println(user.id);
//		System.out.println(user.pw);
		
		System.out.println(user.getId());
		System.out.println(user.getPw());
		System.out.println(user.isAdmin());
		
		User user2 = new User("admin","admin1234");
		System.out.println(user2.getId());
		System.out.println(user2.getPw());
		System.out.println(user2.isAdmin());
		
		//user2.setAdmin(true);
	}

}
