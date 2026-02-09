package Wallet_User_Question;

public class WalletUser {
    int userId;
    String userName;
    double balance;

    public WalletUser(int userId, String userName, double balance){
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public double getBalance() {
        return balance;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return userId +" | "+userName+" | Balance: "+balance;
    }
}
