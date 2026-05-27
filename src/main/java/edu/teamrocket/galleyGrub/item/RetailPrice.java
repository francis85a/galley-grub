package edu.teamrocket.galleyGrub.item;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    static Map<String, Double> prices;
       

    public RetailPrice() {
       prices = new HashMap<>();
       init_prices();
    }

    public static void init_prices(){
       prices.put("Krabby Patty", 1.25);
       prices.put("Coral Bits", 0.50);
       prices.put("Kelp Rings", 0.75);
       prices.put("Golden Loaf", 3.00);
       prices.put("Seafoam Soda", 1.00);
       prices.put("cheese", 0.25);
       prices.put("sauce", 0.50);
       prices.put("medium", 0.25);
       prices.put("large", 0.50);
    }

    public static double get_price(final String item){
        return prices.get(item);
    }

    public static boolean contains(final String item) {
        return prices.containsKey(item);
    }

    public static void display() {
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }
}
