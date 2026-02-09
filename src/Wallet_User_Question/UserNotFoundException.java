package Wallet_User_Question;

public class UserNotFoundException extends Exception {
    public  UserNotFoundException(int userId){
        super("User with ID "+userId+" not found");
    }
}
