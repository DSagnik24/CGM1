package Online_Food_Order;

public class Main {
    public static void main(String[] args) {
        FoodOrderService service = new FoodOrderServiceImpl();

        service.addItem(new FoodItem(1,"Burgir",120.67,5));
        service.addItem(new FoodItem(2,"Pijja",127.67,3));
        service.addItem(new FoodItem(3,"Pasta",129.67,0));

        try{
            System.out.println(service.placeOrder("Alice",1,2));
            System.out.println(service.placeOrder("Ali",2,11));
            System.out.println(service.placeOrder("ice",1,1));
        } catch (ItemNotFoundException | OutOfStockException e) {
            throw new RuntimeException(e);
        }
        service.displayItems();
    }
}
