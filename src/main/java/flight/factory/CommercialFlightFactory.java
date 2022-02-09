package flight.factory;

import exceptions.BadParameterException;
import exceptions.NullParameterException;
import flight.Airline;
import flight.Airport;
import flight.CommercialFlight;

public class CommercialFlightFactory extends FlightFactory {
    public CommercialFlight createFlight(String type, Airline airline, Airport origine, Airport destination) throws NullParameterException, BadParameterException {
        if (type == null) {
           throw new NullParameterException("Null type used in CommercialFlightFactory");
        } else if (type.equalsIgnoreCase("commercial")){
            return new CommercialFlight(airline, origine, destination);
        } else {
            throw new BadParameterException("Bad type parameter used in CommercialFlightFactory");
        }
    }
}
