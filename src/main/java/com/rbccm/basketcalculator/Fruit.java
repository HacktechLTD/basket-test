package com.rbccm.basketcalculator;

public enum Fruit {
    BANANA(1),
    ORANGE(2),
    APPLE(3),
    LEMON(5),
    PEACH(7);

    private final int price;   // in pence

    Fruit(int price) {
        this.price = price;
    }

    int price() {
        return price;
    }
}
