package hw3.FlightManager;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.flight.Flight;
import hw3.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProxyFlightManager extends FlightManager {
    private static FlightManager fm;


    public String createFlight(String type, Airline airline, Airport origin, Airport destination) throws Exception, NullParameterException {
        System.out.println("Creating Flight");
        if (fm == null) {
            this.fm = FlightManager.getInstance();
        }
        return fm.createFlight(type, airline, origin, destination);
    }

    public Optional<Flight> getFlightByNumber(String flightNum) throws Exception {
        System.out.println("Flight Number: " + flightNum + " is being retrieved");
        if (fm == null) {
            this.fm = FlightManager.getInstance();
        }
        return fm.getFlightByNumber(flightNum);
    }
}
