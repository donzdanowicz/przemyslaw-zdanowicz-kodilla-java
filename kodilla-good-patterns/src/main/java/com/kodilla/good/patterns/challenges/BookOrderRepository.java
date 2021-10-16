package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository{
    public void createOrder (User user, LocalDateTime dateOfOrder, double price, double quantity){
        System.out.println("Book order created");
    }
}
