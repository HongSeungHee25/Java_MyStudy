package exceptionTest;

public class MyException extends Exception{

	public MyException() {
		//예외 메세지
		super("올바르지 않은 이메일 형식");
	}
}
