package edu.teamrocket.galleyGrub.extras;

import java.util.Optional;

import edu.teamrocket.galleyGrub.order.Comanda;

public abstract class Extra {
    static final String CHEESE = "Cheese";
    static final String SAUCE = "Sauce";
    static final String SIZE_LARGE = "Size Large";

    String extraProduct;
    Optional<Extra> nextExtra;

    public Extra() {
        this.extraProduct = "";
        this.nextExtra = Optional.empty();
    }

    public void setNextExtra(Extra extra) {
        this.nextExtra = Optional.of(extra);
    }

    public abstract void sumExtras(Comanda order);
    
}
