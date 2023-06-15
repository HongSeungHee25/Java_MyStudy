package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		//boxing
		
		Integer num = new  Integer(3);
		Integer num2 = Integer.valueOf(3);
		Double doubleVar = Double.valueOf(3.0);
		Boolean bool = Boolean.valueOf(false);
		Integer num3 = 3;
		
		System.out.println(num.toString());
		System.out.println(num2);
		System.out.println(doubleVar);
		System.out.println(bool);
		System.out.println(num3);
		
		//unboxing
		
		int intVar = num.intValue();
		double dobleVar2 = doubleVar.doubleValue();
		boolean bool2 = bool.booleanValue();
		
		int intVar2 = num;
		
		System.out.println(intVar);
		System.out.println(dobleVar2);
		System.out.println(bool2);
		System.out.println(intVar2);
		
	}

}
