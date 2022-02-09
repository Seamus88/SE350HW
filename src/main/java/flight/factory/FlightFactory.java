package flight.factory;

import exceptions.BadParameterException;
import exceptions.NullParameterException;
import flight.Airline;
import flight.Airport;
import flight.CommercialFlight;

public abstract class FlightFactory {
    public abstract CommercialFlight createFlight(String type, Airline airline, Airport origine, Airport destination) throws NullParameterException, BadParameterException;
}
