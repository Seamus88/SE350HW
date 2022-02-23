package hw3.factory;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.CommercialFlight;

public abstract class FlightFactory {
    public abstract CommercialFlight createFlight(String type, Airline airline, Airport origine, Airport destination) throws NullParameterException, BadParameterException;
}
