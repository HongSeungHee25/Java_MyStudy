package day12;

public class InitAr {
	public static void main(String[] args, String[] arChar) {
		int arint[]=new int[3];
		double ardouble[]=new double[3];
		char arChar1[]=new char[3];
		String arString[]=new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.print(arint[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(ardouble[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arChar1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arString[i]+" ");
		}
	}

}
