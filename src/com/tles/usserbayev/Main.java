package com.tles.usserbayev;

import java.util.ArrayList;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {

        // Initialize variables and create default promotions

        PromotionsManager promotionsManager = new PromotionsManager();
        ArrayList<Promotion> pricingRules;

        promotionsManager.createCombinationOffer("mbp", "vga");
        promotionsManager.createDropPrice("ipd", 4, 499.99);
        promotionsManager.createBuyXgetY("atv", 2, 1);

        pricingRules = promotionsManager.getAllPromotions();

        Checkout co = new Checkout(pricingRules);


        // Menu to demonstrate the system
        int option = 0;
        while (option != 5) {
            option = showMenu();
            switch (option) {
                case 1:
                    //Case 1: atv, atv, atv, vga: 249.0
                    co.scan("atv");
                    co.scan("atv");
                    co.scan("atv");
                    co.scan("vga");

                    System.out.println("Case 1, total: " + co.total());

                    co.clearShoppingCart();

                    //Case 2: atv, ipd, ipd, atv, ipd, ipd, ipd: 2718.95
                    co.scan("atv");
                    co.scan("ipd");
                    co.scan("ipd");
                    co.scan("atv");
                    co.scan("ipd");
                    co.scan("ipd");
                    co.scan("ipd");

                    System.out.println("Case 2, total: " + co.total());

                    co.clearShoppingCart();

                    //Case 3: mbp, vga, ipd: 1949.98
                    co.scan("ipd");
                    co.scan("mbp");
                    co.scan("vga");

                    System.out.println("Case 3, total: " + co.total());

                    co.clearShoppingCart();


                    //Case 4: vga, vga, vga, vga
                    co.scan("vga");
                    co.scan("vga");
                    co.scan("vga");
                    co.scan("vga");

                    System.out.println("Case 4, total: " + co.total());
                    co.clearShoppingCart();

                    break;
                case 2:
                    promotionsManager.printPromotions();
                    break;
                case 3:
                    promotionsManager.removePromotion(0);
                    pricingRules = promotionsManager.getAllPromotions();
                    co.updatePricingRules(pricingRules);
                    break;
                case 4:
                    System.out.println("When buy 3 or more vga, new price is 20.0. Enter 1 to see new total for case 4");
                    promotionsManager.createDropPrice("vga", 3, 20.0);
                    pricingRules = promotionsManager.getAllPromotions();
                    co.updatePricingRules(pricingRules);
                    break;
                case 5:
                    exit();
                    break;

                default:
                    System.out.println("Sorry, please enter valid input");
            }
        }
    }


    public static int showMenu() {

        int option = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("-------------------------------------");

        System.out.println("1. Scan products shown in the task");
        System.out.println("2. Promotions list");
        System.out.println("3. Remove Example: Remove Promotion 1");
        System.out.println("4. Add Promotion Example");
        System.out.println("5. Exit");

        System.out.println("--------------");
        System.out.println("Enter your choice:");

        option = keyboard.nextInt();

        return option;

    }

}
