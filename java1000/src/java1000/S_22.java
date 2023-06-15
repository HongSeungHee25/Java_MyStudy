package java1000;

public class S_22 {

	public static int topIndex(int[] scores) {
		//가장 높은 성적의 인덱스를 반환하는 함수를 구현하새요
		int topScore = 0;
		int topIndex = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > topScore) {
				topScore = scores[i];
				topIndex = i;
			}
		}
		return topIndex;
	}
	
	public static void main(String[] args) {
		//고득점자 찾기
		//성적표 >> Elena 65, Suzie 74, John 23, Emily 75, Neda 68, Kate 96, Alex 88, Daniel 98,Hamilton 54
		
		String[] names = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
		int i = topIndex(scores);
		System.out.printf("1등 : %s(%d)\n",names[i],scores[i]);
		}
	}


