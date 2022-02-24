package hw3.flight;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.CommercialFlight;
import hw3.flight.Flight;
import hw3.flight.PassangerFlight;

import java.util.HashMap;
import java.util.Map;

public class FlightFactory {

    private FlightFactory() {};

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws BadParameterException, NullParameterException {
        if (type.equals("commercialFlight")) {
            return new CommercialFlight(airline, origin, destination);
        } else if (type.equals("passangerFlight")) {
            return new PassangerFlight(airline, origin, destination);
        } else {
            return null;
        }
    }

}
