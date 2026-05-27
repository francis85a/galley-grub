package edu.teamrocket.galleyGrub.receipts;

import edu.teamrocket.galleyGrub.extras.Extra;
import edu.teamrocket.galleyGrub.order.Comanda;

public interface Ticket {
    public Comanda getOrder();

    public void setChain(Extra);

    public Extra getChain();

    public Double total();
    
    public void sumExtrasCharge();

    public void print();
}
