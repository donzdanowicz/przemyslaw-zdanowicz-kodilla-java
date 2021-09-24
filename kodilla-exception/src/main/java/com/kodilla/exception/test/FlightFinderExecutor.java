package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinderExecutor {
    public static void main (String[] args) throws RouteNotFoundException{
        Flight flight1 = new Flight("New York", "Paris");
        Flight flight2 = new Flight("Los Angeles", "Lodz");
        Flight flight3 = new Flight(null, null);

        FlightFinder flightFinder1 = new FlightFinder();
        FlightFinder flightFinder2 = new FlightFinder();
        FlightFinder flightFinder3 = new FlightFinder();

        System.out.println("Try #1 with airport present in the map:");
        try {
            flightFinder1.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("There's no such airport in the map!");
        } finally {
            System.out.println("");
        }

        System.out.println("Try #2 with airport not present in the map:");
        try {
            flightFinder2.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("There's no such airport in the map!");
        } finally {
            System.out.println("");
        }


        System.out.println("Try #3 with null instead of airport name:");
        try {
            flightFinder3.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("There's no such airport in the map!");
        } finally {
            System.out.println("");
        }
    }
}



