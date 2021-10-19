package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.*;

public class Flight {
    private int number;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private Set<Flight> flights = new HashSet<>();

    public Flight(int number, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDate, LocalDateTime arrivalDate) {
        this.number = number;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public int getNumber() {
        return number;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return "\nFlight #" + number + " from " + departureAirport.getLocation() + " to " + arrivalAirport.getLocation() + ":\n"
                + "Departure date: " + departureDate + ". Arrival date: " + arrivalDate + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return number == flight.number && departureAirport.equals(flight.departureAirport)
                && arrivalAirport.equals(flight.arrivalAirport) && departureDate.equals(flight.departureDate)
                && arrivalDate.equals(flight.arrivalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

