package flight;

import flight.exceptions.BadParameterException;
import flight.exceptions.NullParameterException;
import flight.airline.Airline;
import flight.airport.Airport;
import flight.factory.CommercialFlightFactory;
import flight.factory.FlightFactory;

import java.util.ArrayList;
import java.util.List;

public final class FlightManager {
    private static FlightManager fmInstance;
    private static List<CommercialFlight> flights;
    private static FlightFactory factory;


    public static FlightManager getInstance() throws Exception {
        if (fmInstance == null) {
            fmInstance = new FlightManager();
            flights = new ArrayList();
        }
        return fmInstance;
    }

    public FlightManager() {};

    public String createFlight() throws BadParameterException, NullParameterException {
        //RANDOM CREATION FOR NOW
        CommercialFlightFactory cff = new CommercialFlightFactory();
        Airport origin = new Airport("ORD");
        Airport destination = new Airport("LAX");
        Airline airline = new Airline("SW");
        CommercialFlight cf = cff.createFlight("commercial", airline, origin, destination);
        flights.add(cf);
        return cf.getFlightNumber();
    }

    public CommercialFlight getFlightByNumber(String flightNum) throws BadParameterException, NullParameterException {
        for (int i = 0; i < flights.size() - 1; i++) {
            if (flights.get(i).getFlightNumber().equals(flightNum)) {
                return flights.get(i);
            } else {
                throw new BadParameterException("Parameter flight number unknown.");
            }
        }

        return null;
    }
}
