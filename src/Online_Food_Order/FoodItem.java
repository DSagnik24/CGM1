package Online_Food_Order;

public class FoodItem {
    private int itemId;
    private String itemName;
    private double price;
    private int availableQuantity;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public FoodItem(int itemId, String itemName, double price, int availableQuantity){
       this.itemId = itemId;
       this.itemName = itemName;
       this.price = price;
       this.availableQuantity = availableQuantity;
    }

}
