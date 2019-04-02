package com.tles.usserbayev;

import java.util.HashMap;
import java.util.Hashtable;

public class Products {
    private Hashtable<String, Double> products = new Hashtable<>();

    public Products(){
        products.put("ipd", 549.99);
        products.put("mbp", 1399.99);
        products.put("atv", 109.50);
        products.put("vga", 30.00);
    }

    public Double getPrice(String sku) {
        return products.getOrDefault(sku, 0.0);
    }
}