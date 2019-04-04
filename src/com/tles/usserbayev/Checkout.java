package com.tles.usserbayev;

import java.util.ArrayList;
import java.util.HashMap;

// Scans products. Checkout gets promotions and calculates the total.
public class Checkout {

    private HashMap<String, Integer> shoppingCart = new HashMap<>();
    private Products products;
    public ArrayList<Promotion> pricingRules;

    public Checkout(ArrayList<Promotion> pricingRules) {

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

        for (Promotion promotion : pricingRules
             ) {
            sum = sum - promotion.calculateDiscount(shoppingCart, products);

        }


        return sum;
    }

    public void clearShoppingCart() {
        shoppingCart.clear();
    }

    public void updatePricingRules(ArrayList<Promotion> pricingRules) {
        this.pricingRules = pricingRules;
    }
}
