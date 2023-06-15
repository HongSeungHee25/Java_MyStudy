package ex;

import java.util.Scanner;

public class IfEx3 {
	
	public static void main(String[] args) {
//		//정수 한 개를 입력 받아서,그 수가 50이상의 수인지 50미만의 수인지 판단하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>>");
		int num = sc.nextInt();
		String msg = "";
		if(num>=50) {
			msg = "50 이상입니다";
		}else {
			msg = "50 미만입니다";
		}System.out.println("입력하신 정수는 "+msg);
		
//		//1학년부터 6학년까지 중간고사 시험을 보았다
//		//4학년부터 6학년까지 70점 이상이면 합격, 그 외에 학년은 60점 이상이면 합격이다.
//		//점수가 0미만 100초과이면 경고문구 출력!
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("학년을 입력하세요>>");
		int gr = sc1.nextInt();
		System.out.println("점수를 입력하세요>>");
		int score = sc1.nextInt();
		String msg1 = "잘못 입력하셨습니다.";
		if(0<=score&&score<=100) {
			if(60<=score) {
				if(gr<4) {
					msg1 = "합격입니다.";
				}else if(score>=70) {
					msg1 = "합격입니다.";
				}else {
					msg1 = "불합격입니다.조금 더 분발해주세요.";
				}
			}else {
				msg1 = "불합격입니다.조금 더 분발해주세요.";
			}
		}System.out.println(gr+"학년인 당신은 "+score+"점으로 "+msg1);
		
		//사용자로부터 국어,수학,영어 점수를 입력받아, 
		//그 수들의 최대값과,최소값,합계와 평균 구하기
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요>>");
		int kor = sc2.nextInt();
		System.out.println("수학점수를 입력하세요>>");
		int math = sc2.nextInt();
		System.out.println("영어점수를 입력하세요>>");
		int eng = sc2.nextInt();
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		int max = kor;
		int min = kor;
		//최대값
		if(max < math)max = math;
		if(max < eng)max = eng;
		//최소값
		if(min > math)min = math;
		if(min > eng)min = eng;
		
		String msg2 = "최대점수 : "+max+"점"+"\n최소점수 : "
						+min+"점"+"\n합계점수 : "+sum+"점"
						+"\n평균 : "+avg+"점 입니다.";					  
		System.out.println(msg2);
		
		
		
		
		
		
		
		
	}

}
