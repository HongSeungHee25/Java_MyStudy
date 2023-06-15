package day06;

public class ToArrayTest {

	public static void main(String[] args) {
		
		//for문
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		//이중 for문
		
		for (int i = 0; i < 3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("i=" +i+ " j="+j);
			}
		}
		
		//이차원 배열
		
		int[][] arr= {{1,2},{3,4}};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//이중 for문을 활용한 구구단
	
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
		}
		
		
		
		
		
		
		
	}

}
