package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("New York", false);
        flightMap.put("Paris", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", true);
        flightMap.put("Tokyo", true);
        flightMap.put("Tenerife", false);
        flightMap.put("Los Angeles", false);
        flightMap.put("Honolulu", true);


        for (Map.Entry<String, Boolean> flights : flightMap.entrySet()) {
            if (flightMap.containsKey(flight.getArrivalAirport())) {
                if (flights.getKey().equals(flight.getArrivalAirport())) {
                    System.out.println("Flights to " + flights.getKey() + " possible?: "
                            + flights.getValue());
                }
            } else if (flight.getArrivalAirport() == null) {
                System.out.println("No airport name given!");
                throw new RouteNotFoundException();
            } else {
            System.out.println("No such airport in flight map: " + flight.getArrivalAirport() + ".");
            throw new RouteNotFoundException();
        }
    }
        return flightMap;
    }
}
