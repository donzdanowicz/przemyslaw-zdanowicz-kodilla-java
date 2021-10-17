package com.kodilla.good.patterns.food2Door;

public class SupplyDto {
    public Supplier supplier;
    public boolean isOrdered;

    public SupplyDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
