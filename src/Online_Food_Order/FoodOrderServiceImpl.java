package Online_Food_Order;

import java.util.ArrayList;
import java.util.HashMap;

public class FoodOrderServiceImpl implements FoodOrderService{
    ArrayList<FoodItem> items = new ArrayList<>();
    HashMap<String,Integer> CustomerMap = new HashMap<>();

    @Override
    public void addItem(FoodItem item) {
        items.add(item);
    }

    @Override
    public String placeOrder(String customerName, int itemId, int quantity) throws ItemNotFoundException, OutOfStockException {
       FoodItem i = findItemById(itemId);


        if(i == null){
            throw new ItemNotFoundException(itemId);
        }

        int countOrder = CustomerMap.getOrDefault(customerName, 0);

       if(countOrder+quantity >10){
           return "Order limit exceeded for customer "+ customerName;
       }
       if(i.getAvailableQuantity() < quantity){
            throw new OutOfStockException(i.getItemName());
        }

       i.setAvailableQuantity(i.getAvailableQuantity()-quantity);
       CustomerMap.put(customerName, countOrder+quantity);

        return "Order placed successfully for customer "+ customerName;
    }

    private FoodItem findItemById(int itemId) {
        for(FoodItem it :items){
            if(it.getItemId() == itemId){
                return it;
            }
        }
        return null;
    }

    @Override
    public void displayItems() {
        for(FoodItem it : items){
            System.out.println(it.getItemName());
        }
    }
}
