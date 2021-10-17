package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class GlutenFreeShopOrderingProcess implements OrderingProcess {
    public void createOrder(Supplier supplier, LocalDateTime supplyDate, String productCategory,
                            double price, double quantity) {
        System.out.println("Fill in the form of order on supplier's website.");
        System.out.println("Ask for a proforma invoice.");
        System.out.println("Send transfer.");
        System.out.println("New supply from " + supplier.getName() + " will be delivered on " + supplyDate + ".");
    }
}
