package exceptions;


//checked --> extend Exception
//unchecked --> extend RuntimeException
public class CustomInsufficientBalanceException extends Exception {

    public CustomInsufficientBalanceException() {
        super("Insufficient balance");
    }

    public CustomInsufficientBalanceException(String message){
        super(message);
    }

}
