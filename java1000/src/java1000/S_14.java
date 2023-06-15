package java1000;

import java.util.Scanner;

public class S_14 {

	public static double calculateBMI(double weight, double tall) {
		return weight / (tall * tall);
	}
	public static void printBMIClassfication(double bmi) {
		System.out.printf("BMI : %.2f - ",bmi);
		if(bmi <= 18.5) {
			System.out.println("저체중");
		}else if(bmi < 22.9) {
			System.out.println("정상");
		}else if(bmi < 24.9) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
	}
	
	
	
	public static void main(String[] args) {
		//비만도 측정
		//저체중(18.5이하), 정상(18.5이상~23이하), 과체중(23이상~25이하), 비만(25이상)
		//키가 t미터, 체중이 w킬로그램일 때, BMI는 (BMI = w / t^2)와 같다.
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력해주세요>>");
		double weight = sc.nextDouble();
		System.out.print("키를 입력해주세요>>");
		double tall = sc.nextDouble();
		
		double bmi = calculateBMI(weight, tall);
		printBMIClassfication(bmi);
	}

}
