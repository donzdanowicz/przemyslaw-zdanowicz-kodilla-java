package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class HealthyShopOrderingProcess implements OrderingProcess{
    public void createOrder(Supplier supplier, LocalDateTime supplyDate, String productCategory,
                            double price, double quantity) {
        System.out.println("Call supplier with your order.");
        System.out.println("New supply from " + supplier.getName() + " will be delivered on " + supplyDate + ".");
        System.out.println("At the delivery pay with credit card (so be prepared to have it on you).");
    }
}
