package com.kodilla.good.patterns.food2Door;

public class Application {
    public static void main(String[] args) {
        NewSupplyRetriever newSupplyRetriever = new NewSupplyRetriever();
        NewSupply newSupply = newSupplyRetriever.retrieve();

        SupplyProcessor supplyProcessor = new SupplyProcessor(
               new ExtraFoodShopSupplyService(), new ExtraFoodShopOrderingProcess());
        supplyProcessor.process(newSupply);
    }
}
