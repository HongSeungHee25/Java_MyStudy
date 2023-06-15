package ex;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}public void Hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}public void flying() {
		System.out.println("독수리가 날고 있습니다.");
	}
}
class Bear extends Animal{
	public void move() {
		System.out.println("곰이 이동합니다.");
	}public void biting() {
		System.out.println("곰이 베어뭅니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest ts = new AnimalTest();
		ts.moveAnimal(new Human());
		ts.moveAnimal(new Tiger());
		ts.moveAnimal(new Eagle());
		ts.moveAnimal(new Bear());
		
		Animal[] animalList = new Animal[4];
		animalList[0] = new Human();
		
		ArrayList<Animal>animals = new ArrayList<Animal>();
		
	}

	private void moveAnimal(Animal animal) {
		animal.move();
		//이렇게만 적어주어도 Human, tiger, eagle, bear에 대한
		//move를 출력할 수 있으므로 이 코드 한 줄이 다형성을 나타낸다고 할 수 있다.
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.Hunting();
		}else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}else if(animal instanceof Bear) {
			Bear bear = (Bear)animal;
			bear.biting();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}

}
