package edu.teamrocket.galleyGrub.extras;

import edu.teamrocket.galleyGrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    private Double SIZE_LARGE_PRICE = 0.50d;

    public SizeLargeExtra() {
        super();
        this.extraProduct = SIZE_LARGE;
    }

    @Override
    public void sumExtras(Comanda order) {
        long countSizeLarge = order.itemList().stream()
            .filter(item -> item.toString().contains("large"))
            .count();
        order.updateTotal(SIZE_LARGE_PRICE * countSizeLarge);
        if (this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}
