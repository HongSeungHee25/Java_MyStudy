package inter;

public class RobotB implements RobotInter {

	@Override
	public void moveRight() {
		System.out.println("오른쪽으로 이동");
	}

	@Override
	public void moveLeft() {
		System.out.println("왼쪽으로 이동");
	}

}
