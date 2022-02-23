package hw3.flight.factory;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.CommercialFlight;
import hw3.flight.Flight;
import hw3.flight.PassangerFlight;

import java.util.Map;

public class FlightFactory {

    private static Map<String, Flight> flightCache;

    private FlightFactory() {
    }
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        } else if (type.equals("passangerFlight")) {
            try {
                return new PassangerFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }

        else return null;
    }
}
