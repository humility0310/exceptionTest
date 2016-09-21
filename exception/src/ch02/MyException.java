package ch02;

public class MyException extends Exception {
	private static final long serialVersionUID = 7562717488806209379L;

	public MyException(){
		super("MyException Occurs");
	}
	
	public MyException(String message){
		super(message);
	}
}
