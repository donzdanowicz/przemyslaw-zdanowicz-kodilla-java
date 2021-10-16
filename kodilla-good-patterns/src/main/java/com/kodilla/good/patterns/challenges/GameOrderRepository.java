package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GameOrderRepository implements OrderRepository {
    public void createOrder (User user, LocalDateTime dateOfOrder, double price, double quantity) {
        System.out.println("Game Order created");
    }
}
