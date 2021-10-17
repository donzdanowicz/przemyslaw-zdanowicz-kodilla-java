package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public interface OrderingProcess {
    void createOrder(Supplier supplier, LocalDateTime supplyDate, String productCategory,
                     double price, double quantity);
}
