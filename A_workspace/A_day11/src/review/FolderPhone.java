package review;

public class FolderPhone {

	//field
	//모든 폴더폰은 제조사,모델명,색상,가격이 존재한다
	
	String companyName;
	String modelName;
	String color;
	int price;
	
	//constructor
	public FolderPhone() {
		super();
	}

	public FolderPhone(String companyName, String modelName, String color, int price) {
		super();
		//필드 초기화 코드
		this.companyName = companyName;
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}
	
	//method
	
	void turnOn() {
		System.out.println("전원을 킨다");
	}
	void call() {
		System.out.println("클릭을 통해 전화를 건다");
	}
	void text() {
		System.out.println("클릭을 통해 문자를 보낸다");
	}
}
