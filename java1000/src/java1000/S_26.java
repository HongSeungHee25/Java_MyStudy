package java1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S_26 {

		static class Dice{
			String name;
			int sides;
			boolean alive;
			
			public Dice(String name, int sides) {
				this.name = name;
				this.sides = sides;
				this.alive = true;
			}

			public String getName() {
				return name;
			}

			public int getSides() {
				return sides;
			}
			public boolean isAlive() {
				return alive;
			}
			public void setAlive(boolean alive) {
				this.alive = alive;
			}
			public int roll() {
				Random rand = new Random();
				return rand.nextInt(sides)+1;
			}

			@Override
			public String toString() {
				return name;
			}
		}
	public static void main(String[] args) {
		//주사위 서바이벌
		List<Dice> diceList = new ArrayList<>();
		diceList.add(new Dice("쥐",2));
		diceList.add(new Dice("소",2));
		diceList.add(new Dice("호랑이",4));
		diceList.add(new Dice("토끼",4));
		diceList.add(new Dice("용",6));
		diceList.add(new Dice("뱀",6));
		diceList.add(new Dice("말",8));
		diceList.add(new Dice("양",8));
		diceList.add(new Dice("원숭이",10));
		diceList.add(new Dice("닭",10));
		diceList.add(new Dice("개",12));
		diceList.add(new Dice("돼지",12));
		
		List<Dice> survivors = new ArrayList<>(diceList);
		
		Random random = new Random();
		while(survivors.size()>1) {
			List<Dice>deadDice = new ArrayList<>();
			for(Dice dice : survivors) {
				int result = dice.roll();
				System.out.printf("%s: %d\n",dice.getName(),result);
				if(result % 2 == 0) {
					continue;
				}
				dice.setAlive(false);
				deadDice.add(dice);
			}
			survivors.removeAll(deadDice);
		}
		System.out.printf("생존 주사위 : %s\n",survivors.get(0).getName());
		
		while(survivors.size()>0) {
			List<Dice>deadDice = new ArrayList<>();
			for(Dice dice : survivors) {
				int result = dice.roll();
				System.out.printf("%s: %d\n",dice.getName(),result);
				if(result % 2 == 0) {
					continue;
				}
				deadDice.add(dice);
			}
			survivors.removeAll(deadDice);
		}
		System.out.println("더 이상 생존 주사위가 없습니다.");
	}

}
