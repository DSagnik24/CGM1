package ElectricityBillSystem;

public class LoadExceededException extends Exception{
    public LoadExceededException(String msg){
        super(msg);
    }
}
