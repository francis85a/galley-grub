package edu.teamrocket.galleyGrub.extras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import edu.teamrocket.galleyGrub.order.*;
import edu.teamrocket.galleyGrub.receipts.*;

public class SizeLargeExtraTest {
    
    static Receipt receipt;
    static Extra sizeL;
    static Order order;

    @BeforeAll
    public static void setup_receipt() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium");
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");
        order.addItem("Coral Bits", 1.00, "large");

        receipt = new Receipt(order);

        sizeL = new SizeLargeExtra();
        receipt.setChain(sizeL);
    }

    @Test
    public void sum_extras_cheese_test() {

        sizeL.sumExtras(order);
        assertEquals(1.00d, order.getTotal(), 0.1d);
    }
}
