package hw3;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.Flight;
import hw3.flight.factory.FlightFactory;
import hw3.flight.CommercialFlight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManager {
    private static FlightManager fmInstance;
    private static List<Flight> flights;


    public static FlightManager getInstance() throws Exception {
        if (fmInstance == null) {
            fmInstance = new FlightManager();
        }
        return fmInstance;
    }

    private FlightManager() {
        flights = new ArrayList<Flight>();
    };

    public String createFlight(String type, Airline airline, Airport origin, Airport destination)  {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByNumber(String flightNum) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNum)).findFirst();
    }
}
