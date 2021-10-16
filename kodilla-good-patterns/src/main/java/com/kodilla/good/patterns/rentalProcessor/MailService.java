package com.kodilla.good.patterns.rentalProcessor;

public class MailService implements InformationService{
    public void inform(User user) {
        System.out.println("send email");
    }
}
