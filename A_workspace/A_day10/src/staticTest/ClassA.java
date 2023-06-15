package staticTest;

public class ClassA {

	
	//field
	
	//static field
	static int staticData = 10; //명시적 초기화
	static int[] ar2;
	
	//instance field
	int instanceData = 40;
	int instanceData2 = 20; //명시적 초기화
	
	int[] ar = new int[3];
	
	//static 초기화 블럭
	static{
		ar2 = new int[3];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = i;
		}
	}
	//instance 초기화 블럭
	{
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		instanceData = 30;
	}
	
	public ClassA() {
		super();
	}
	public ClassA(int instanceData) { //생성자 초기화
		super();
		this.instanceData = instanceData;
	}
	//method
	
	//static method
	static void staticMethod() {
		System.out.println("static method");
		//static method는 instance field 사용불가
//		System.out.println(instanceData);
		System.out.println(staticData);
	}
	//instance method
	void instanceMethod() {
		System.out.println("instance method");
		System.out.println(staticData);
	}
}
