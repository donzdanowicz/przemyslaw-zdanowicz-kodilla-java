package com.kodilla.good.patterns.flights;

public class FlightDatabaseRetriever {
    public FlightFinder retrieve() {

        Flight GDAWAR = new Flight("GDA", "WAR");
        Flight GDAPOZ = new Flight("GDA", "POZ");
        Flight WROPOZ = new Flight("WRO", "POZ");
        Flight WARWRO = new Flight("WAR", "WRO");
        Flight WARPOZ = new Flight("WAR", "POZ");
        Flight POZWAR = new Flight("POZ", "WAR");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight(GDAWAR);
        flightFinder.addFlight(GDAPOZ);
        flightFinder.addFlight(WROPOZ);
        flightFinder.addFlight(WARWRO);
        flightFinder.addFlight(WARPOZ);
        flightFinder.addFlight(POZWAR);

        return flightFinder;
    }

}
