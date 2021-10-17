package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class NewSupplyRetriever {
    public NewSupply retrieve() {
        Supplier supplier = new Supplier(1,"ExtraFoodShop", "John", "Wilkes",
                "Hollywood Boulevard 19 , Los Angeles, USA");
        LocalDateTime supplyDate = LocalDateTime.of(2021, 10, 17, 12, 0);
        String productCategory = "Vegetables";
        double price = 119.99;
        double quantity = 2;

        return new NewSupply(supplier, supplyDate, productCategory, price, quantity);
    }
}
