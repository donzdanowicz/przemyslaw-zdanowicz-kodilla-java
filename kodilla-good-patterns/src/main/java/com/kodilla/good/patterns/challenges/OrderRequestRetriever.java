package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User(5019, "Sam", "Jones");
        LocalDateTime dateOfOrder = LocalDateTime.of(2021, 10, 16, 12, 0);
        double price = 119.99;
        double quantity = 2;

        return new OrderRequest(user, dateOfOrder, price, quantity);
    }

}
