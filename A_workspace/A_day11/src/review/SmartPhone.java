package review;

//기존에 있는 FolderPhone 클래스를 상속받아 SmartPhone 클래스 선언
public class SmartPhone extends FolderPhone{
	
	//field
	boolean bluetooth;

	//constructor
	public SmartPhone() {
		super();
	}

	public SmartPhone(String companyName, String modelName, String color, int price,boolean bluetooth) {
		//부모에게 상속받은 필드를 부모 생성자가 초기화한다
		super(companyName, modelName, color, price);
		//자식이 가지고 있는 필드를 자식 생성자가 초기화한다
		this.bluetooth = bluetooth;
	}
	//method

	@Override
	void call() {
		System.out.println("전화를 걸기~!");
		super.call();
	}

	@Override
	void text() {
		System.out.println("터치를 통해 문자를 보낸다");
	}
	
	void connectBluetooth() {
		System.out.println("블루투스 연결");
		bluetooth = true;
	}
	
	
	
}
