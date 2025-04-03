package exception;

public class Wrong extends RuntimeException {
	private static String message="invalid";
	Wrong(){
		super(message);
	}
	Wrong(String message){
		super(message);
	}

}
