package com.sokat.cart.app;

import com.sokat.cart.model.*;
import com.sokat.cart.service.ShoppingCart;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Electronics("Laptop", 1200.00, 1));
        cart.add(new Clothing("Jeans", 60.00, 2));
        cart.add(new Grocery("Milk", 4.50, 3));

        cart.printInvoice();
    }
}
