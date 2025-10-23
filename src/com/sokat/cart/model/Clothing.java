package com.sokat.cart.model;

public final class Clothing extends Item {
    public Clothing(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double applyDiscount() {
        return subtotal() * 0.85;
    }
}
