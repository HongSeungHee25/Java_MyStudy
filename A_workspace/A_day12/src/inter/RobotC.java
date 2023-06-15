package inter;

public class RobotC extends RobotClass implements RobotInter{

	@Override
	public void moveRight() {
		System.out.println("move right");
	}

	@Override
	public void moveLeft() {
		System.out.println("move left");
	}

	@Override
	void moveUp() {
		System.out.println("move up");
	}

	@Override
	void moveDown() {
		System.out.println("move down");
	}

}
