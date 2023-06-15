package day06;

public class ArrayTest {

	public static void main(String[] args) {

		//어떤값을 넣을지 알고 있을때
		//자료형[] 배열명 = {값1,값2,값3...};
		
		int[] ar = {1,2,3,4,5};
		
		System.out.println(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		//변수명 = 값;
		
		ar[0]=13;
		System.out.println(ar[0]);
		
		//어떤값을 넣을지는 모르지만 몇칸 필요한지 알때
		//자료형[] 배열명 = new 자료형[칸수]
		
		int[] ar2=new int[5];
		
//		System.out.println(ar2[0]);
//		System.out.println(ar2[1]);
//		System.out.println(ar2[2]);
//		System.out.println(ar2[3]);
//		System.out.println(ar2[4]);
		
		for(int i=0;i<ar2.length;i++){
			ar2[i]=20;
			System.out.println(ar2[i]);
		}
		//어떤값을 넣을지도, 몇칸이 필요한지도 모를때
		//자료형[] 배열명 = null;
		
		int[] ar3=null;
		System.out.println(ar3);
		
		ar3 = new int[3];
		System.out.println(ar3);
		}
		
		
		}


