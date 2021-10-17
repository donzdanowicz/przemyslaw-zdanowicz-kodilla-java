package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class GlutenFreeShopSupplyService implements SupplyService{
    public boolean supply(Supplier supplier, LocalDateTime supplyDate, String productCategory, double price, double quantity) {
        return true;
    }
}
