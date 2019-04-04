package com.tles.usserbayev;

import java.util.HashMap;

// Bulk discount. When buy more than itemsCount, the price for each item us newPrice.
public class DropPrice implements Promotion {
    private String item;
    private Integer itemsCount;
    private double newPrice;

    public DropPrice(String item, Integer itemsCount, double newPrice) {
        this.item = item;
        this.itemsCount = itemsCount;
        this.newPrice = newPrice;
    }

    @Override
    public double calculateDiscount(HashMap<String, Integer> shoppingCart, Products products) {
        double discount = 0.0;
        if (shoppingCart.containsKey(item)) {
            if(shoppingCart.get(item) >= itemsCount) {
                discount = discount + (products.getPrice(item) - newPrice) * shoppingCart.get(item);
            }
        }
        return discount;
    }


    @Override
    public String getDescription() {
        String description = "Buy " + itemsCount + " or more of " + item + " then price is: " + newPrice + " each";
        return description;
    }
}
