package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;


public class CheeseExtra extends Extra {

    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        long countCheese = order.itemList().stream()
            .filter(item -> item.toString().contains("cheese"))
            .count();
        order.updateTotal(Extras.CHEESE.getPrice() * countCheese);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
    
}
