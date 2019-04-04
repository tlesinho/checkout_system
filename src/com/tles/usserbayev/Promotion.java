package com.tles.usserbayev;

import java.util.HashMap;

//General Promotion interface. Needs shopping cart and list of products

public interface Promotion {
      double calculateDiscount(HashMap<String, Integer> shoppingCart, Products products);
      String getDescription();
}
