package com.kodilla.good.patterns.food2Door;

public class SupplyProcessor {
    private SupplyService supplyService;
    private OrderingProcess orderingProcess;

    public SupplyProcessor(SupplyService supplyService, OrderingProcess orderingProcess) {
        this.supplyService = supplyService;
        this.orderingProcess = orderingProcess;
    }

    public SupplyDto process(final NewSupply newSupply) {
        boolean isOrdered = supplyService.supply(newSupply.getSupplier(), newSupply.getSupplyDate(), newSupply.getProductCategory(),
                newSupply.getPrice(), newSupply.getQuantity());
        if (isOrdered) {
            orderingProcess.createOrder(newSupply.getSupplier(), newSupply.getSupplyDate(), newSupply.getProductCategory(),
                    newSupply.getPrice(), newSupply.getQuantity());
            return new SupplyDto(newSupply.getSupplier(), true);
        } else {
            return new SupplyDto(newSupply.getSupplier(), false);
        }
    }
}
