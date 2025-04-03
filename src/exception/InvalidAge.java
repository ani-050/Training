package exception;

public class InvalidAge extends RuntimeException{
	private static String message="age invalid";
	InvalidAge(){
		super(message);
	}
	public InvalidAge(String message) {
		super(message);
	}

}
