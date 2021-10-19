package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Airport {
    private final int id;
    private final String location;
    private Set<Airport> airports = new HashSet<>();

    public Airport(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Airport #" + id + " {" + location + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return id == airport.id && Objects.equals(location, airport.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }
}
