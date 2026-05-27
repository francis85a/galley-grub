package edu.teamrocket.galleyGrub.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {

    private Order order;

    @BeforeEach
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

    @Test
    public void add_multiple_different_items_test() {
        this.order.addItem("Krabby Patty", 1.25);
        this.order.addItem("Squid Ink", 2.50);
        this.order.addItem("Kelp Shake", 3.00);
        assertEquals(3, this.order.size());
    }

    @Test
    public void get_total_test() {
        this.order.updateTotal(1.25);
        this.order.updateTotal(2.50);
        assertEquals(3.75, this.order.getTotal(), 0.01);
    }

    @Test
    public void order_empty_total_test() {
        assertEquals(0.0, this.order.getTotal());
    }

    @Test
    public void item_list_not_null_test() {
        assertNotNull(this.order.itemList());
    }

    @Test
    public void add_item_with_extra_test() {
        this.order.addItem("Krabby Patty", 1.25, "extra cheese");
        assertEquals(1, this.order.size());
    }
    
}
