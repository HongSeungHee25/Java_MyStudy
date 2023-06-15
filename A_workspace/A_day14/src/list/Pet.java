package list;

public class Pet {

	String name;
	String color;
	
	public Pet() {
		super();
	}

	public Pet(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", color=" + color + "]";
	}
	
	
}
