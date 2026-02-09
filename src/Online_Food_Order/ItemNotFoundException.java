package Online_Food_Order;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(int id){
        super("Item with ID "+id+" not found");
    }
}
