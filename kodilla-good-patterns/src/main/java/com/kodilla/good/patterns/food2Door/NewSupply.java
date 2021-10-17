package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class NewSupply {
    Supplier supplier;
    LocalDateTime supplyDate;
    String productCategory;
    double price;
    double quantity;

    public NewSupply(Supplier supplier, LocalDateTime supplyDate, String productCategory, double price, double quantity) {
        this.supplier = supplier;
        this.supplyDate = supplyDate;
        this.productCategory = productCategory;
        this.price = price;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getSupplyDate() {
        return supplyDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}


