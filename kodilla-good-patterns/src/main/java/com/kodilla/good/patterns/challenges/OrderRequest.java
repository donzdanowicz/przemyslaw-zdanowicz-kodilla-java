package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    User user;
    LocalDateTime dateOfOrder;
    double price;
    double quantity;

    public OrderRequest(User user, LocalDateTime dateOfOrder, double price, double quantity) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.price = price;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
