package Wallet_User_Question;

public interface WalletService {
    void addUSer(WalletUser user);
    String addMoney(int userId, double amount)
        throws UserNotFoundException;
    String makePayment(int senderId, int receiverId, double amount)
        throws UserNotFoundException, InsufficientBalanceException;
    void displayUsers();
}
