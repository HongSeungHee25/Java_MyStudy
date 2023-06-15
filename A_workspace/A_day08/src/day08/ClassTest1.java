package day08;

import java.util.Scanner;

public class ClassTest1 {

	public static void main(String[] args) {

		//설계도대로 무언가 구체적인것을 만들어낸다
		//클래스대로 객체를 생성한다
		
		//bike : BikeVersion1 
		//new BikeVersion1() : bike
		BikeVersion1 bike = new BikeVersion1();
		
		//sc : Scanner 
		//new Scanner(system.in) : Scanner
		Scanner sc = new Scanner(System.in);
		
		//ar : int[] 
		//new int[3] : int[]
		int[] ar = new int[3];
		
		//age : int 
		//10 : int
		int age = 10;
		
		System.out.println(bike.bell);
		System.out.println(bike.color);
		System.out.println(bike.price);
		
		bike.move();
		bike.stop();
		
		bike.color = "red";
		System.out.println(bike.color);
		
		BikeVersion1 bike2 = new BikeVersion1("blue");
		BikeVersion1 bike3 = new BikeVersion1();
		//BikeVersion1 bike4 = new BikeVersion1(100000);
		//이 형태의 생성자는 선언되어 있지 않으므로 호출할 수 없다(사용할수 없다)
		
		System.out.println(bike2.color);
	}

}
