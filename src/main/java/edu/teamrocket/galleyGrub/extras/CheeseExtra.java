package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;


public class CheeseExtra extends Extra {

    private Double CHEESE_PRICE = 0.25d;

    public CheeseExtra() {
        super();
        this.extraProduct = CHEESE;
    }

    @Override
    public void sumExtras(Comanda order) {
        long countCheese = order.itemList().stream()
            .filter(item -> item.toString().contains("cheese"))
            .count();
        order.updateTotal(CHEESE_PRICE * countCheese);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
    
}
