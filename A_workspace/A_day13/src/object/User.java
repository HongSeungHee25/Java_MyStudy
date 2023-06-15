package object;

import java.util.Objects;

public class User {
	
	String id;
	String pw;
	int userNumber;
	
	public User() {
		super();
	}

	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public User(String id, String pw, int userNumber) {
		super();
		this.id = id;
		this.pw = pw;
		this.userNumber = userNumber;
	}

	//alt + shift + s + s 
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", userNumber=" + userNumber + "]";
	}
	
	@Override
	public int hashCode() {
		return userNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return userNumber == other.userNumber;
	}

	
	
}
