package com.sokat.cart.model;

public final class Electronics extends Item {
    public Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double applyDiscount() {
        return subtotal() * 0.90;
    }
}