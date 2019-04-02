package com.tles.usserbayev;

import java.util.HashMap;

public class Checkout {

    private HashMap<String, Integer> shoppingCart = new HashMap<>();
    private Products products;
    private PricingRules pricingRules;

    public Checkout(PricingRules pricingRules) {

        products = new Products();
        this.pricingRules = pricingRules;
    }

    public void scan(String item) {
        if (shoppingCart.containsKey(item)) {

            Integer count = shoppingCart.get(item);
            shoppingCart.put(item, count + 1);

        } else {
            shoppingCart.put(item, 1);
        }
    }

    public Double total() {
        double sum = 0.0;

        for (HashMap.Entry<String, Integer> entry : shoppingCart.entrySet()) {
            sum = sum + products.getPrice(entry.getKey()) * entry.getValue();
        }

        sum = sum + pricingRules.calculateDiscount(shoppingCart);


        return sum;
    }
}
