package com.sokat.cart.model;

public sealed abstract class Item permits Electronics, Clothing, Grocery {
    protected final String name;
    protected final double price;
    protected final int quantity;

    protected Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double applyDiscount();

    public double subtotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " (x" + quantity + "): $" + price;
    }
}
