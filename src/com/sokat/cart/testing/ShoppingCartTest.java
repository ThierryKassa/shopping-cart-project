package com.sokat.cart.testing;

import com.sokat.cart.model.*;


import com.sokat.cart.service.ShoppingCart;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void testCartTotals() {
    	 // Electronics (10% off): 1000 -> 900
        // Clothing (15% off): 2 * 50 -> 85
        // Expected subtotal: 985.00
    	// Sales Tax (8.5%): 985.00 * 0.085 -> 83.725
    	// Total : 985.00 + 83.725 -> 1068.725
    	//Note each decimal stop at 2 digits 

        ShoppingCart cart = new ShoppingCart();
        cart.add(new Electronics("Laptop", 1000.00, 1));
        cart.add(new Clothing("Shirt", 50.00, 2));

        assertEquals(985.00, cart.subtotal(), 0.01);
        assertEquals(83.73, cart.tax(), 0.01);
        assertEquals(1068.73, cart.total(), 0.01);
    }
}

