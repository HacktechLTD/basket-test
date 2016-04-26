package com.rbccm.basketcalculator;

import java.util.Map;

public class TotalCalculator {
    public static int calculate(final Map<Fruit, Integer> basketItems) {
        int total = 0;

        for (Map.Entry<Fruit, Integer> item : basketItems.entrySet()) {
            int price = item.getKey().price();
            int quantity = item.getValue().intValue();

            total += price * quantity;
        }

        return total;
    }
}
