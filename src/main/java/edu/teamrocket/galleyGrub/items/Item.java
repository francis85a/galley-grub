package edu.teamrocket.galleyGrub.items;

import java.util.Objects;

public class Item implements Product {

    String name;
    double price;
    String extra;
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item (String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }
    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return this.extra == null;
    }

    @Override
    public String toString() {
        return "Item(name: " + this.name + ", price: " + this.price + ", extra: " + this.extra + ")\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Item other = (Item) obj;

        return name.equals(other.name)
            && price == other.price
            && ((extra == null && other.extra == null) ||
                (extra != null && extra.equals(other.extra)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, extra);
    }
}
    

