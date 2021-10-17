package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public interface SupplyService {
    boolean supply(Supplier supplier, LocalDateTime supplyDate, String productCategory, double price, double quantity);
}
