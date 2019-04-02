package com.tles.usserbayev;

public class Main {

    public static void main(String[] args) {
        Checkout co = new Checkout(new PricingRules());

//        //Case 1: atv, atv, atv, vga: 249.0
//        co.scan("atv");
//        co.scan("atv");
//        co.scan("atv");
//        co.scan("vga");

        //Case 2: atv, ipd, ipd, atv, ipd, ipd, ipd: 2718.95
//        co.scan("atv");
//        co.scan("ipd");
//        co.scan("ipd");
//        co.scan("atv");
//        co.scan("ipd");
//        co.scan("ipd");
//        co.scan("ipd");
//
//        //Case 3: mbp, vga, ipd: 1949.98
        co.scan("ipd");
        co.scan("mbp");
        co.scan("vga");

        System.out.println(co.total());
    }
}
