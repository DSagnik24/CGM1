package Online_Food_Order;

public interface FoodOrderService {
    void addItem(FoodItem item);
    String placeOrder(String customerName, int itemId, int quantity)
        throws ItemNotFoundException, OutOfStockException;
    void displayItems();

}
