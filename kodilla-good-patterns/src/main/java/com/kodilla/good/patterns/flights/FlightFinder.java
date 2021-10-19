package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private final Set<Flight> flights = new HashSet<>();
    private final Set<Airport> airports = new HashSet<>();
    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public Set<Airport> getAirports() {
        return airports;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public Set<Flight> findDirectFlightsFrom(Airport airport) {
        return getFlights().stream()
                .filter(flight -> airport.equals(flight.getDepartureAirport()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsTo(Airport airport) {
        return getFlights().stream()
                .filter(flight -> airport.equals(flight.getArrivalAirport()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsFromTo(Airport departureAirport, Airport arrivalAirport) {
        return getFlights().stream()
                .filter(flight -> arrivalAirport.equals(flight.getArrivalAirport()))
                .filter(flight -> departureAirport.equals(flight.getDepartureAirport()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findTransferFlightsTo(Airport airport) {

        Set<Flight> findTransferFlightsTo = new HashSet<>();
        for (Flight value : findDirectFlightsTo(airport)) {
            findTransferFlightsTo.addAll(findDirectFlightsTo(value.getDepartureAirport()));
            findTransferFlightsTo.addAll(findDirectFlightsFromTo(value.getDepartureAirport(), airport));
        }
        return findTransferFlightsTo;
    }

    public Set<Flight> findTransferFlightsFrom(Airport airport) {
        Set<Flight> findTransferFlightsFrom = new HashSet<>();
        for (Flight value : findDirectFlightsFrom(airport)) {
            findTransferFlightsFrom.addAll(findDirectFlightsFrom(value.getArrivalAirport()));
            findTransferFlightsFrom.addAll(findDirectFlightsFrom(airport));
        }
        return findTransferFlightsFrom;
    }

    public Set<Flight> findTransferFlightsFromTo(Airport departureAirport, Airport arrivalAirport) {
        Set<Flight> findTransferFlightsFromTo = new HashSet<>();
        for (Flight value : findDirectFlightsTo(arrivalAirport)) {
            findTransferFlightsFromTo.addAll(findDirectFlightsTo(value.getArrivalAirport()));
            findTransferFlightsFromTo.addAll(findDirectFlightsFromTo(departureAirport, value.getDepartureAirport()));
        }
        return findTransferFlightsFromTo;
    }
}
