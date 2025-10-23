package com.sokat.cart.model;

public final class Grocery extends Item {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double applyDiscount() {
        return subtotal() * 0.95;
    }
}