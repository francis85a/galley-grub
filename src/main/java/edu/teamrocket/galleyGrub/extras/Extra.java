package edu.teamrocket.galleyGrub.extras;

import java.util.Optional;

import edu.teamrocket.galleyGrub.order.Comanda;

public abstract class Extra {

    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public void setNextExtra(Extra extra) {
        this.nextExtra = Optional.of(extra);
    }

    public abstract void sumExtras(Comanda order);
    
}
