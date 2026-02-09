package Wallet_User_Question;

import java.util.ArrayList;
import java.util.HashMap;

public class WalletServiceImpl implements  WalletService{
    ArrayList<WalletUser> Users = new ArrayList<>();
    HashMap<Integer, Integer> Transactions = new HashMap<>();

    @Override
    public void addUSer(WalletUser user) {
        Users.add(user);
    }

    @Override
    public String addMoney(int userId, double amount) throws UserNotFoundException {
        WalletUser u = findUserById(userId);

        if(u == null){
            throw  new UserNotFoundException(userId);
        }
        int count = Transactions.getOrDefault(userId, 0);

        if(count == 5){
            return "Transaction Limit exceeded for users "+u.getUserName();
        }

        u.setBalance(u.getBalance() + amount);
        Transactions.put(userId, count +1);


        return "Money added successfully to " + u.getUserName();
    }

    private WalletUser findUserById(int userId) {
        for(WalletUser u : Users){
            if(u.getUserId() == userId){
                return u;
            }
        }
        return null;
    }

    @Override
    public String makePayment(int senderId, int receiverId, double amount) throws UserNotFoundException, InsufficientBalanceException {
        WalletUser sender = findUserById(senderId);
        WalletUser reciever = findUserById(receiverId);

        if(sender == null){
            throw new UserNotFoundException(senderId);
        }
        if(reciever == null){
            throw new UserNotFoundException(receiverId);
        }
        int count = Transactions.getOrDefault(senderId, 0);

        if(count == 5){
            return "Transaction limit exceeded for user "+ sender.getUserName();
        }
        if (sender.getBalance() < amount) {
            throw new InsufficientBalanceException(sender.getUserName());
        }

        sender.setBalance(sender.getBalance()-amount);
        reciever.setBalance(reciever.getBalance()-amount);

        Transactions.put(senderId, count + 1);

        return "Payment of " + amount + " successful from " +
                sender.getUserName() + " to " + reciever.getUserName();
    }

    @Override
    public void displayUsers() {
        for(WalletUser u :Users){
            System.out.println(u);
        }
    }
}
