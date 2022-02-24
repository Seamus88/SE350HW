package hw3;

import hw3.airline.Airline;
import hw3.airline.AirlineFactory;
import hw3.airport.Airport;
import hw3.airport.AirportFactory;
import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.flight.Flight;

import java.util.Optional;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        String cFlightNumber = FlightManager.getInstance().createFlight("commercialFlight", AirlineFactory.getAirline("SWest"), AirportFactory.getAirport("JAX"), AirportFactory.getAirport("MDW"));
        String pFlightNumber = FlightManager.getInstance().createFlight("passangerFlight", AirlineFactory.getAirline("SWest"), AirportFactory.getAirport("MDW"), AirportFactory.getAirport("JAX"));

        Optional<Flight> cFlight = FlightManager.getInstance().getFlightByNumber(cFlightNumber);
        Optional<Flight> pFlight = FlightManager.getInstance().getFlightByNumber(pFlightNumber);

        System.out.println(cFlight.get());
        System.out.println(pFlight.get());

    }
}
