package access1;

public class User {

	//field
	
	private String id;
	private String pw;
	private boolean isAdmin;
	
	//constructor
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		//만약에 아이디가 admin 이라면 관리자
		//만약에 아이디가 admin 아니라면 일반 유저
		if(id.equals("admin")) {
			setAdmin(true);
		}
		
	}
	
	
	//getter, setter
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	private void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
	
}
