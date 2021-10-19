package com.kodilla.good.patterns.flights;

import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightDatabaseRetriever databaseRetriever = new FlightDatabaseRetriever();
        FlightFinder flightFinder = databaseRetriever.retrieve();
        Airport GDA = new Airport(1, "Gdańsk");
        Airport WAR = new Airport(2, "Warszawa");
        Airport WRO = new Airport(3, "Wrocław");
        Airport POZ = new Airport(4, "Poznań");

        System.out.println("\nDirect Flights: \n");
        System.out.println("to POZ");
        Set<Flight> foundFlightsTo = flightFinder.findDirectFlightsTo(POZ);
        System.out.println(foundFlightsTo);
        System.out.println("from WRO");
        Set<Flight> foundFlightsFrom = flightFinder.findDirectFlightsFrom(WRO);
        System.out.println(foundFlightsFrom);
        System.out.println("from WRO to POZ");
        Set<Flight> foundFlightsFromTo = flightFinder.findDirectFlightsFromTo(GDA, POZ);
        System.out.println(foundFlightsFromTo);

        System.out.println("\nTransfer Flights: \n");
        System.out.println("to WRO");
        Set<Flight> foundTransferFlightsTo = flightFinder.findTransferFlightsTo(WRO);
        System.out.println(foundTransferFlightsTo);
        System.out.println("from GDA");
        Set<Flight> foundTransferFlightsFrom = flightFinder.findTransferFlightsFrom(GDA);
        System.out.println(foundTransferFlightsFrom);
        System.out.println("From GDA to WRO");
        Set<Flight> foundTransferFlightsFromTo = flightFinder.findTransferFlightsFromTo(GDA, WRO);
        System.out.println(foundTransferFlightsFromTo);
    }
}
