package Wallet_User_Question;

public class Main {
    public static void main(String[] args) {
        WalletService ws = new WalletServiceImpl();

        ws.addUSer(new WalletUser(101,"Sagnik",1000.00));
        ws.addUSer(new WalletUser(102,"Sagnik2",2000.00));
        ws.addUSer(new WalletUser(103,"Sagnik3",3000.00));
        ws.addUSer(new WalletUser(104,"Sagnik4",4000.00));
        ws.addUSer(new WalletUser(105,"Sagnik5",5000.00));

        try{
            System.out.println( ws.addMoney(101,200000));
            System.out.println( ws.addMoney(101,300000));
            System.out.println( ws.addMoney(104,50000));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
        ws.displayUsers();

    }
}
