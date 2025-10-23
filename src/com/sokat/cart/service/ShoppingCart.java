package com.sokat.cart.service;


import com.sokat.cart.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final double TAX_RATE = 0.085;
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public double subtotal() {
        return items.stream().mapToDouble(Item::applyDiscount).sum();
    }

    public double tax() {
        return subtotal() * TAX_RATE;
    }

    public double total() {
        return subtotal() + tax();
    }

    public void printInvoice() {
        System.out.println("----- Shopping Cart Summary -----");
        items.forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.printf("Subtotal (after discounts): $%.2f%n", subtotal());
        System.out.printf("Sales Tax (8.5%%): $%.2f%n", tax());
        System.out.printf("Total: $%.2f%n", total());
    }
}
