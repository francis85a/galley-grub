package edu.teamrocket.galleyGrub.receipts;

import edu.teamrocket.galleyGrub.extras.Extra;
import edu.teamrocket.galleyGrub.order.Comanda;

public class Receipt implements Ticket {

    private Double total = 0d;
    private Comanda order;
    private Extra firstExtra = null;

    public Receipt(Comanda order) {
        this.order = order;
        this.total = order.getTotal();
    }

    public Comanda getOrder() {
        return this.order;
    }

    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    public Extra getChain() {
        return this.firstExtra;
    }

    public Double total() {
        if (this.total == 0d) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal(); 
        }
        return this.total;
    }

    public void sumExtrasCharge() {
        if (this.firstExtra != null) {
            this.firstExtra.sumExtras(this.order);
        }
    }

    public void print() {
         this.getOrder().display();
        System.out.print("\tTOTAL --------> " + String.format("%.2f", this.total) + "$\n");
    }
}
