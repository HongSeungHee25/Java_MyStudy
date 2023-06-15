package zoo;

import java.util.ArrayList;

class Animal{
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}
class Tiger extends Animal{
	public void sound() {
		System.out.println("호랑이가 소리를 냅니다.");
	}public void barkT() {
		System.out.println("어흥!!");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("소가 소리를 냅니다.");
	}public void barkC() {
		System.out.println("음무~");
	}
}
class Monkey extends Animal{
	public void sound() {
		System.out.println("원숭이가 소리를 냅니다.");
	}public void barkM() {
		System.out.println("우끼끼끼~");
	}
}
class Sheep extends Animal{
	public void sound() {
		System.out.println("양이 소리를 냅니다.");
	}public void barkS() {
		System.out.println("음메에에에~음메에에에~");
	}
}
class Puppy extends Animal{
	public void sound() {
		System.out.println("강아지가 소리를 냅니다.");
	}public void barkP() {
		System.out.println("멍멍!!멍멍!!");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("고양이가 소리를 냅니다.");
	}public void barkC() {
		System.out.println("미야옹~미야옹~");
	}
}

public class ZooClass {
	public static void main(String[] args) {
	
		ZooClass zoo = new ZooClass();
		zoo.soundAnimal(new Tiger());
		zoo.soundAnimal(new Cow());
		zoo.soundAnimal(new Monkey());
		zoo.soundAnimal(new Sheep());
		zoo.soundAnimal(new Puppy());
		zoo.soundAnimal(new Cat());
		
		Animal[] animalList = new Animal[6];
		animalList[0] = new Tiger();
		
		ArrayList<Animal>animals = new ArrayList<Animal>();
}

	private void soundAnimal(Animal animal) {
		animal.sound();
		
		if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.barkT();
		}else if(animal instanceof Cow) {
			Cow cow = (Cow)animal;
			cow.barkC();
		}else if(animal instanceof Monkey) {
			Monkey monkey = (Monkey)animal;
			monkey.barkM();
		}else if(animal instanceof Sheep) {
			Sheep sheep = (Sheep)animal;
			sheep.barkS();
		}else if(animal instanceof Puppy) {
			Puppy puppy = (Puppy)animal;
			puppy.barkP();
		}else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.barkC();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}
		
}
