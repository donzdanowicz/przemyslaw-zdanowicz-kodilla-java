package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService orderService = new ProductOrderService(
                new MailService(), new GameOrderService(), new GameOrderRepository());
        orderService.process(orderRequest);
    }
}
