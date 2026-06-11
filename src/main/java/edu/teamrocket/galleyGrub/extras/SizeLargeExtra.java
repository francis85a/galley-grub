package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    public SizeLargeExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        long countSizeLarge = order.itemList().stream()
            .filter(item -> item.toString().contains("large"))
            .count();
        order.updateTotal(Extras.LARGE.getPrice() * countSizeLarge);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}
