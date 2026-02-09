package ElectricityBillSystem;

public class InvalidMeterReadingException extends RuntimeException{
    public InvalidMeterReadingException(String msg){
        super(msg);
    }
}
