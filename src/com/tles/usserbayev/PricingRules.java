package com.tles.usserbayev;

import java.util.HashMap;

public class PricingRules {
    public double calculateDiscount(HashMap<String, Integer> shoppingCart) {
        double totalDiscount = 0.0;
        Products products = new Products();


        // Buy smth get another for free
        if (shoppingCart.containsKey("mbp") && shoppingCart.containsKey("vga")) {
            if (shoppingCart.get("mbp") >= shoppingCart.get("vga")) {
                totalDiscount = totalDiscount - products.getPrice("vga") * shoppingCart.get("vga");

            } else {
                totalDiscount = totalDiscount - products.getPrice("vga") * shoppingCart.get("mbp");
            }
        }

        //Drop to X when bought more than Y
        if (shoppingCart.containsKey("ipd")) {
            if(shoppingCart.get("ipd") >= 4) {
                totalDiscount = totalDiscount - (products.getPrice("ipd") - 499.99) * shoppingCart.get("ipd");
            }
        }

        //X for Y
        if(shoppingCart.containsKey("atv")) {
            if(shoppingCart.get("atv") >= 3) {
                int a = shoppingCart.get("atv")/3;
                System.out.println(a);

                totalDiscount = totalDiscount - products.getPrice("atv") * a;
            }
        }

        return totalDiscount;
    }
}
