package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    public void inform(User user) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        int id = orderRequestRetriever.retrieve().getUser().getUserId();
        String name = orderRequestRetriever.retrieve().getUser().getName();
        String surname = orderRequestRetriever.retrieve().getUser().getSurname();
        System.out.println("Email sent to user" + id + "(" + name + " " + surname + ").");
    }
}
