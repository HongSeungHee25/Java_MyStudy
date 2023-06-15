package inter;

public class InterfaceTest {
	
	void useClass(RobotClass robot) {
		robot.moveDown();
		robot.moveUp();
	}
	
	void useInter(RobotInter robot) {
		robot.moveLeft();
		robot.moveRight();
	}

	public static void main(String[] args) {

		// 실습1.
		// RobotClass 추상클래스
		// void moveUp() 추상메소드
		// void moveDown() 추상메소드

		// RobotInter 인터페이스
		// void moveRight() 추상메소드
		// void moveLeft() 추상메소드

		// RobotA 클래스(RobotClass 상속)
		// moveUp() 위로 이동 출력
		// moveDown() 아래로 이동 출력

		// RobotB 클래스(RobotInter 구현)
		// moveRight() 오른쪽으로 이동 출력
		// moveLeft() 왼쪽으로 이동 출력

		// RobotC 클래스 (RobotClass 상속, RobotInter 구현)
		// moveUp() move up 출력
		// moveDown() move down 출력
		// moveRight() move right 출력
		// moveLeft() move left 출력

		// robotA 객체는 RobotA, RobotClass, Object 타입을 가진다
		RobotA robotA = new RobotA();
		// robotB 객체는 RobotB, RobotInter, Object 타입을 가진다
		RobotB robotB = new RobotB();
		// robotC 객체는 RobotC, RobotClass, RobotInter, Object 타입을 가진다
		RobotC robotC = new RobotC();		
		
		InterfaceTest it = new InterfaceTest();
		
		it.useClass(robotA);
//		it.useClass(robotB); 
		it.useClass(robotC);
		
//		it.useInter(robotA);
		it.useInter(robotB);
		it.useInter(robotC);
		
	   }

	
	}


