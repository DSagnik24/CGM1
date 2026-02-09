package Wallet_User_Question;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String userName){
        super("Insufficient balance for user  "+userName);
    }
}
