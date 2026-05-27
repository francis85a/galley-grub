package edu.teamrocket.galleyGrub.order;

import java.util.List;
import edu.teamrocket.galleyGrub.items.Item;

public interface Comanda {
    
    void addItem(String name, double price);

    void addItem(String name, double price, String extra);

    int size();

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double price);

    void display();

}
