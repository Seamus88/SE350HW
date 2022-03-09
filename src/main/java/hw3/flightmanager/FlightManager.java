package hw3.flightmanager;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exceptions.NullParameterException;
import hw3.flight.Flight;
import hw3.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightManager
{
    private static FlightManager fm;
    private static List<Flight> flights;
    public FlightManager() {
        flights = new ArrayList();
    };

    public static FlightManager getInstance() throws Exception {
        if (fm == null) {
            fm = new FlightManager();
        }
        return fm;
    }




    public String createFlight(String type, Airline airline, Airport origin, Airport destination) throws Exception, NullParameterException {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByNumber(String flightNum) throws Exception {
        return flights.stream().filter(flt -> flt.getFlightNumber().equals(flightNum)).findFirst();
    }
}
