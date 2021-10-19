package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class FlightDatabaseRetriever {
    public FlightFinder retrieve() {
        Airport GDA = new Airport(1, "Gdańsk");
        Airport WAR = new Airport(2, "Warszawa");
        Airport WRO = new Airport(3, "Wrocław");
        Airport POZ = new Airport(4, "Poznań");

        Flight GDAWAR = new Flight(1,GDA, WAR, LocalDateTime.of(2021,10,18,12,0),
                LocalDateTime.of(2021,10,18,16,0));
        Flight GDAPOZ = new Flight(2, GDA, POZ, LocalDateTime.of(2021,10,20,8,0),
                LocalDateTime.of(2021,10,20,10,0));
        Flight WROPOZ = new Flight(3, WRO, POZ, LocalDateTime.of(2021,10,20,11,0),
                LocalDateTime.of(2021,10,20,13,0));
        Flight WARWRO = new Flight(4, WAR, WRO, LocalDateTime.of(2021,10,20,15,0),
                LocalDateTime.of(2021,10,20,17,0));
        Flight WARPOZ = new Flight(4, WAR, POZ, LocalDateTime.of(2021,10,22,11,0),
                LocalDateTime.of(2021,10,22,13,0));
        Flight POZWAR = new Flight(4, POZ, WAR, LocalDateTime.of(2021,10,23,11,0),
                LocalDateTime.of(2021,10,22,13,0));

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addAirport(GDA);
        flightFinder.addAirport(WAR);
        flightFinder.addAirport(WRO);
        flightFinder.addAirport(POZ);
        flightFinder.addFlight(GDAWAR);
        flightFinder.addFlight(GDAPOZ);
        flightFinder.addFlight(WROPOZ);
        flightFinder.addFlight(WARWRO);
        flightFinder.addFlight(WARPOZ);
        flightFinder.addFlight(POZWAR);

        return flightFinder;
    }

}
