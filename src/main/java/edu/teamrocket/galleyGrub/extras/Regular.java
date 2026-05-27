package edu.teamrocket.galleyGrub.extras;

import java.util.Optional;

import edu.teamrocket.galleyGrub.items.Item;
import edu.teamrocket.galleyGrub.order.Comanda;


public class Regular extends Extra {

    public Regular() {
    }

    @Override
    public void sumExtras(Comanda order) {
        
        Optional<Double> sumRegularPrices = order.itemList().stream()
                            .map(Item::price)
                            .reduce(Double::sum);

        if (sumRegularPrices.isPresent()) {
            order.updateTotal(sumRegularPrices.get());  
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}
