package edu.teamrocket.galleyGrub.order;

import java.util.ArrayList;
import java.util.List;
import edu.teamrocket.galleyGrub.items.Item;
import edu.teamrocket.galleyGrub.items.ItemFactory;

public class Order implements Comanda {
    private Double total = 0d;
    private final List<Item> items = new ArrayList<Item>();

    public Order() {
    }

    public void addItem(String name, double price) {
        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);
    }

    public void addItem(String name, double price, String extra) {
        Item item = ItemFactory.getItem(name, price, extra);
        this.items.add(item);
    }

    public int size(){
        return this.items.size();
    }

    public List<Item> itemList() {
        return this.items;
    }

    public Double getTotal() {
        return this.total;
    }

    public void updateTotal(Double total){
        this.total += total;
    }

    public void display(){
        System.out.print("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
