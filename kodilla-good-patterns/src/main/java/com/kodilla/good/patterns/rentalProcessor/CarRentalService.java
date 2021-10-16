package com.kodilla.good.patterns.rentalProcessor;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService{
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        return true;
    }
}
