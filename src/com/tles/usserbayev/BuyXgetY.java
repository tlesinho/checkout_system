package com.tles.usserbayev;

import java.util.HashMap;

// Buy X items and get Y items for free. items are the same products
public class BuyXgetY implements Promotion {
    private String item;
    private int numberOfPaidItems;
    private int numberOfFreeItems;

    public BuyXgetY(String item, int numberOfPaidItems, int numberOfFreeItems) {
        this.item = item;
        this.numberOfPaidItems = numberOfPaidItems;
        this.numberOfFreeItems = numberOfFreeItems;
    }

    @Override
    public double calculateDiscount(HashMap<String, Integer> shoppingCart, Products products) {
        double discount = 0.0;

        if (shoppingCart.containsKey(item)) {
            if (shoppingCart.get(item) >= (numberOfPaidItems + numberOfFreeItems)) {
                int a = shoppingCart.get(item) / (numberOfPaidItems + numberOfFreeItems);
                discount = discount + products.getPrice(item) * a * numberOfFreeItems;
            }
        }

        return discount;
    }

    @Override
    public String getDescription() {
        String description = "Buy " + numberOfPaidItems + " of " + item + " get " + numberOfFreeItems + " for free";
        return description;
    }
}
