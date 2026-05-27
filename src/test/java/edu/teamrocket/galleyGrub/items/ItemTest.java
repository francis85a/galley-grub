package edu.teamrocket.galleyGrub.items;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void equals_test() {
        Item patty = new Item("Krabby Patty", 1.25);
        Item kpatty = new Item("Krabby Patty", 1.25);
        assertTrue(patty.equals(kpatty));
    }
    
    @Test
    public void equals_reflexive() {
        Item patty = new Item("Krabby Patty", 1.25);
        assertTrue(patty.equals(patty));
    }
    
    @Test
    public void equals_symmetry() {
        Item a = new Item("Krabby Patty", 1.25);
        Item b = new Item("Krabby Patty", 1.25);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
    
    @Test
    public void equals_transitive() {
        Item a = new Item("Krabby Patty", 1.25);
        Item b = new Item("Krabby Patty", 1.25);
        Item c = new Item("Krabby Patty", 1.25);
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }
    
    @Test
    public void equals_consistent() {
        Item a = new Item("Krabby Patty", 1.25);
        Item b = new Item("Krabby Patty", 1.25);
        for (int i = 0; i < 5; i++) {
            assertTrue(a.equals(b));
        }
    }
    
    @Test
    public void equals_null_and_different_type() {
        Item patty = new Item("Krabby Patty", 1.25);
        assertFalse(patty.equals(null));
        assertFalse(patty.equals("Krabby Patty"));
    }
    
    @Test
    public void not_equals_on_different_fields() {
        Item a = new Item("Krabby Patty", 1.25);
        Item b = new Item("Krabby Patty", 1.50);
        Item c = new Item("Double Patty", 1.25);
        assertFalse(a.equals(b));
        assertFalse(a.equals(c));
    }
    
    @Test
    public void hashCode_consistent_with_equals() {
        Item a = new Item("Krabby Patty", 1.25);
        Item b = new Item("Krabby Patty", 1.25);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void toString_contains_fields() {
        Item a = new Item("Krabby Patty", 1.25);
        String s = a.toString();
        assertNotNull(s);
        assertTrue(s.contains("Krabby") || s.contains("Krabby Patty"));
        assertTrue(s.contains("1.25") || s.contains("1,25"));
    }
    
}