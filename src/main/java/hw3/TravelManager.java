package hw3;

import hw3.FlightManager.FlightManager;
import hw3.FlightManager.ProxyFlightManager;
import hw3.airline.AirlineFactory;
import hw3.airport.AirportFactory;
import hw3.exceptions.NullParameterException;
import hw3.flight.Flight;

import java.util.Optional;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        FlightManager fm = new ProxyFlightManager();
        
        String cFlightNumber = fm.createFlight("commercialFlight", AirlineFactory.getAirline("SWest"), AirportFactory.getAirport("JAX"), AirportFactory.getAirport("MDW"));
        String pFlightNumber = fm.createFlight("passangerFlight", AirlineFactory.getAirline("SWest"), AirportFactory.getAirport("MDW"), AirportFactory.getAirport("JAX"));

        Optional<Flight> cFlight = fm.getFlightByNumber(cFlightNumber);
        Optional<Flight> pFlight = fm.getFlightByNumber(pFlightNumber);

        System.out.println(cFlight.get());
        System.out.println(pFlight.get());

    }
}
