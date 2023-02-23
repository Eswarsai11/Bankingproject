
public class InsufficientbalanceException extends RuntimeException {
	private String message;
	InsufficientbalanceException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
		
	}

}
//Rules to work with customUser-Defined Exception
//1.create a class with Exception name
//2.if a class extends Exception->checked Exception
//2.if a class extends RuntimeException->checked Exception
//3.override getMessage()->(variable,constructor,method)
//4.invoke the exception object using throw keyword,
//handle it using try and catch block with suitable message.
