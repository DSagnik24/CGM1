package Exceptions_Handeling.Custom_Exception;

public class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(String message) {
        super(message);
    }
}
