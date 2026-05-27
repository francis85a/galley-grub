package edu.teamrocket.galleyGrub.order;

public interface Comanda {
    
    void addItem(String name, double price);

    void addItem(String name, double price, String extra);

    int size();

    List<Item> itemList();

    double getTotal();

    void updateTotal(double price);
    
    void display();

}
