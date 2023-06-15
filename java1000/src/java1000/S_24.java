package java1000;

public class S_24 {
	
	//교수 클래스 구현하기
	//Professor 클래스는 다음과 같은 정보를 갖는다 >> 이름, 소속, 학점 잘주는 정도
	//Professor 클래스는 다음과 같은 기능을 할 수 있다 >> 출석부르기, 과제내주기, 학점주기
	
	public class Professor{
		private String name;
		private String affiliation;
		private int rating;
		
		//생성자
		public Professor(String name, String affiliation, int rating) {
			this.name = name;
			this.affiliation = affiliation;
			this.rating = rating;
		}
		
		//출석 부르기
		public void callAttendance() {
			System.out.println(name+" 교수님 : 출석부르겠습니다.");
		}
		
		//과제 내주기
		public void giveAssignment() {
			System.out.println(name+" 교수님 : 오늘 과제입니다.");
		}
		
		//학점 주기
		public void giveGrade() {
			System.out.println(name+" 교수님 : 학점은 이렇게 주도록 하죠.");
		}

		//getter, setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAffiliation() {
			return affiliation;
		}

		public void setAffiliation(String affiliation) {
			this.affiliation = affiliation;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}
		
		
	}
}
