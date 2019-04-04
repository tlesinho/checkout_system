package com.tles.usserbayev;

import java.util.HashMap;

// When buying one item another is free
public class CombinationOffer implements Promotion {
    private String paidItem;
    private String freeItem;


    public CombinationOffer(String paidItem, String freeItem) {
        this.paidItem = paidItem;
        this.freeItem = freeItem;
    }

    @Override
    public double calculateDiscount(HashMap<String, Integer> shoppingCart, Products products) {
        double discount = 0.0;
        if (shoppingCart.containsKey(paidItem) && shoppingCart.containsKey(freeItem)) {
            if (shoppingCart.get(paidItem) >= shoppingCart.get(freeItem)) {
                discount = discount + products.getPrice(freeItem) * shoppingCart.get(freeItem);
            } else {
                discount = discount + products.getPrice(freeItem) * shoppingCart.get(paidItem);
            }
        }
        return discount;
    }

    @Override
    public String getDescription() {
        String description = "Buy " + paidItem + " and get " + freeItem + " for free";
        return description;
    }
}
