package com.tles.usserbayev;

import java.util.ArrayList;

// Manager to create, store, remove promotions of different type.
public class PromotionsManager {
    private ArrayList<Promotion> promotionsList = new ArrayList<>();

    public void createCombinationOffer(String paidItem, String freeItem) {
        Promotion combinationOffer = new CombinationOffer(paidItem, freeItem);
        promotionsList.add(combinationOffer);
    }

    public void createDropPrice(String item, Integer itemsCount, double newPrice) {
        Promotion dropPrice = new DropPrice(item, itemsCount, newPrice);
        promotionsList.add(dropPrice);
    }

    public void createBuyXgetY(String item, int numberOfPaidItems, int numberOfFreeItems) {
        Promotion buyXgetY = new BuyXgetY(item, numberOfPaidItems, numberOfFreeItems);
        promotionsList.add(buyXgetY);
    }

    public void removePromotion(int index) {
        promotionsList.remove(index);
    }

    public ArrayList<Promotion> getAllPromotions() {
        return promotionsList;
    }

    public void printPromotions(){
        for (Promotion promotion : promotionsList
        ) {
            System.out.println(promotionsList.indexOf(promotion) + 1 + ". " + promotion.getDescription());
        }
    }

}
