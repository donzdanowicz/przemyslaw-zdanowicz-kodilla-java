package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private final Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public Set<Flight> findDirectFlightsFrom(String departureAirport) {
        return getFlights().stream()
                .filter(flight -> departureAirport.equals(flight.getDepartureAirport()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsTo(String arrivalAirport) {
        return getFlights().stream()
                .filter(flight -> arrivalAirport.equals(flight.getArrivalAirport()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsFromTo(String departureAirport, String arrivalAirport) {
        return getFlights().stream()
                .filter(flight -> arrivalAirport.equals(flight.getArrivalAirport()))
                .filter(flight -> departureAirport.equals(flight.getDepartureAirport()))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> findTransfer(String departureAirport, String arrivalAirport) {
        Set<Flight> flightsFrom = findDirectFlightsFrom(departureAirport);
        Set<Flight> flightsTo = findDirectFlightsTo(arrivalAirport);

        return flightsFrom.stream()
                .filter(f -> flightsTo.contains(new Flight(f.getArrivalAirport(), arrivalAirport)))
                .map(v -> {
                    return List.of(
                            v, new Flight(v.getArrivalAirport(), arrivalAirport)
                    );
                })
                .collect(Collectors.toSet());
    }
}
