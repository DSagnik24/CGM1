package Online_Food_Order;

public class OutOfStockException extends Exception {
    public OutOfStockException(String itemName){
        super("Item "+itemName+" is out of stock");
    }
}
