package edu.teamrocket.galleyGrub.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OrderTest {

    private Order order = null;

    @Test
    public void setup_order() {
        order = new Order();
    }

    @Test
    public void add_absent_item_test() {
        this.order.addItem("Krabby Patty", 1.25);
        assertEquals(1, this.order.size());
    }

    @Test
    public void add_present_item_test() {
        this.order.addItem("Krabby Patty", 1.25);
        this.order.addItem("Krabby Patty", 1.25);        
        assertEquals(2, this.order.size());
    }
    
}
