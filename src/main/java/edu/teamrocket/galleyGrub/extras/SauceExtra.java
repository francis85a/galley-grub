package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;


public class SauceExtra extends Extra {

    private Double SAUCE_PRICE = 0.50d;

    public SauceExtra() {
        super();
        this.extraProduct = SAUCE;
    }

    @Override
    public void sumExtras(Comanda order) {
        long countSauce = order.itemList().stream()
            .filter(item -> item.toString().contains("sauce"))
            .count();
        order.updateTotal(SAUCE_PRICE * countSauce);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}
