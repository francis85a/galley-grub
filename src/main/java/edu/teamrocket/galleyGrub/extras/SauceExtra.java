package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;


public class SauceExtra extends Extra {

    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        long countSauce = order.itemList().stream()
            .filter(item -> item.toString().contains("sauce"))
            .count();
        order.updateTotal(Extras.SAUCE.getPrice() * countSauce);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}
