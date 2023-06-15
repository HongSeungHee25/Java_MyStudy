package day09;

class ClassA{
	
	//field
	int num;

	//constructor
	public ClassA(int num) {
		this.num = num;
	}
}
public class Review {
	
	int changeDate(int date) {
		date = 10;
		return date;
	}
	int[] changeDate(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 20;
		}
		return ar;
	}
	ClassA changeDate(ClassA classA) {
		classA.num = 30;
		return classA;
	}
	void methodA(int[] arDate) {
		arDate = new int[] {1,2,3};
	}
	
	public static void main(String[] args) {
		
		int date = 1;
		int[] ar = {2, 2};
		ClassA classA = new ClassA(3);
		
		Review review = new Review();
		
		//date = 1
		System.out.println("변경전 = "+date);
		date = review.changeDate(date);
		System.out.println("변경후 = "+date);
		
		//ar[0] = 2
		System.out.println("변경전 = "+ar[0]);
		review.changeDate(ar);
		System.out.println("변경후 = "+ar[0]);
		
		//num = 3
		System.out.println("변경전 = "+classA.num);
		review.changeDate(classA);
		System.out.println("변경후 = "+classA.num);
		
		//Call by value : 값에 의한 호출
		//메서드의 매개변수에 값을 전달
		//Call by reference : 주소에 의한 호출
		//메서드의 매개변수에 주소를 전달
		
		//ar 저장공간에 2칸짜리 정수형 배열의 주소값이 담긴다
		ar = new int[] {2,2};
		//methodA() 전달해준 매개변수에 3칸짜리 정수형 배열의 주소값을
		//담는 코드가 작성되어 있다
		review.methodA(ar);
		
		System.out.println(ar[0]);
	}
}
