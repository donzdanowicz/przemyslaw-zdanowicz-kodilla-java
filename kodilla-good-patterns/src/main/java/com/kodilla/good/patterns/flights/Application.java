package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightDatabaseRetriever databaseRetriever = new FlightDatabaseRetriever();
        FlightFinder flightFinder = databaseRetriever.retrieve();

        System.out.println("\nDirect Flights: \n");

        System.out.println("Flights to POZ");
        Set<Flight> foundFlightsTo = flightFinder.findDirectFlightsTo("POZ");
        System.out.println(foundFlightsTo);
        System.out.println("Flights from WRO");
        Set<Flight> foundFlightsFrom = flightFinder.findDirectFlightsFrom("WRO");
        System.out.println(foundFlightsFrom);
        System.out.println("Flights from GDA to POZ");
        Set<Flight> foundFlightsFromTo = flightFinder.findDirectFlightsFromTo("GDA", "POZ");
        System.out.println(foundFlightsFromTo);

        System.out.println("\nTransfer flights from GDA to WRO");
        Set<List<Flight>> foundTransferFlightsFrom = flightFinder.findTransfer("GDA", "WRO");
        System.out.println(foundTransferFlightsFrom);
    }
}
