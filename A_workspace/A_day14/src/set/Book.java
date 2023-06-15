package set;

import java.util.Objects;

public class Book {
	
	int number;
	String name;
	int price;
	
	public Book() {
		super();
	}

	public Book(int number, String name, int price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "책 이름 : "+name+"책 번호 : "+number;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return number == other.number;
	}
	
}
