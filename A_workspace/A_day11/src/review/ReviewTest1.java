package review;

public class ReviewTest1 {

	void usePhoneMethod(FolderPhone phone) {
		
		//SmartPhone 클래스
		//call 메서드 -> 상속받은 메서드 재정의
		//text 메서드 -> 상속받은 메서드 재정의
		//trunOn 메서드 -> 상속받은 메서드
		//connectBluetooth 메서드 -> 추가된 메서드
		
		//call() 메서드는 SmartPhone클래스에서 재정의 되어 있기 때문에
		//down casting 하지 않아도 재정의 되어있는 메서드를 호출할수 있다
		phone.call();
		
		phone.text();
		
		//turnOn() 메서드는 SmartPhone 클래스에서 재정의하지 않았기 때문에
		//FolderPhone 클래스의 메서드대로 호출된다
		phone.turnOn();
		
		//매개변수의 phone 객체가 SmartPhone 타입을 가지고 있다면
		//down casting 후 connectBluetooth()메서드를 호출(사용)한다
		if(phone instanceof SmartPhone) {
			((SmartPhone)phone).connectBluetooth();
		}
	}
	
	public static void main(String[] args) {
		
		FolderPhone folderPhone1 = new FolderPhone();
		
		FolderPhone folderPhone2 = new FolderPhone("apple","iphone13","white",1000000);
		
		SmartPhone smartPhone1 = new SmartPhone();
		
		SmartPhone smartPhone2 = new SmartPhone("samsung","galaxy23","black",1000000,true);
		
		//부모로부터 상속받은 필드를 자식객체를 통해 호출
		System.out.println(smartPhone2.color);
		smartPhone2.turnOn();
		
		ReviewTest1 rt = new ReviewTest1();
		
		rt.usePhoneMethod(folderPhone1);
		rt.usePhoneMethod(smartPhone2);
		
	}

}
