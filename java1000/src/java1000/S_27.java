package java1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S_27 {

	static class User{
		//필드..
		String name;
		boolean isMale;
		double point;
		
		//생성자..
		User(String name, boolean isMale){
			this.name = name;
			this.isMale = isMale;
			this.point = Math.random() * 5;
			
		}
		@Override
		public String toString() {
			return String.format("%s(%s: %.1f)", name,isMale ? "남자" : "여자",point);
		}
	}
	
	public static void main(String[] args) {
		//소개팅 매칭
		//이름과 성별을 입력하여 회원객체 10명 생성, 회원 평점은 랜덤하게 0.0부터 5.0사이의 값을 갖도록 만들기
		//toString 메서드를 오버라이드 하여 객체의 정보를 아래 형식과 같이 출력가능하게 하기
		//public String toString() {return String.format("%s(%s: %.1f)\n", name, isMale, point);}
		//회원들의 가능한 매칭 쌍을 출력. 매칭 기준 >> 성별이 다를것, 평점차이가 0.8점 이상 차이나지 않을 것
		
		System.out.println("☆★☆★☆★☆★매칭 성공☆★☆★☆★☆★");
		
		String[] maleNames = {"도윤", "서준", "하준", "은우", "시우", "이준", "지호", "예준", "유준", "재호"};
		String[] femaleNames = {"서아", "하윤", "지안", "서윤", "하은", "아린", "하린", "아윤", "지우", "승희"};
		
		List<User> maleUsers = new ArrayList<>();
		List<User> femaleUsers = new ArrayList<>();
		List<User> matchedUsers = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			String name = i < 10 ? maleNames[i] : femaleNames[i-10];
			boolean isMale = i < 10;
			User user = new User(name, isMale);
			
			if(isMale) {
				maleUsers.add(user);
			}else {
				femaleUsers.add(user);
			}
		}
		Collections.sort(maleUsers, Comparator.comparingDouble(user -> -user.point));
		Collections.sort(femaleUsers, Comparator.comparingDouble(user -> -user.point));
		
		for(User maleUser : maleUsers) {
			for(User femaleUser : femaleUsers) {
				if(!matchedUsers.contains(maleUser)&&!matchedUsers.contains(femaleUser)&&maleUser.isMale != femaleUser.isMale&&
					Math.abs(maleUser.point - femaleUser.point)<0.8) {
					System.out.printf("%s - %s\n",maleUser, femaleUser);
					matchedUsers.add(maleUser);
					matchedUsers.add(femaleUser);
					break;
				}
			}
		}
				
}
}