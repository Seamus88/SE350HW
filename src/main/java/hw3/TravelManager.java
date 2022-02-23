package hw3;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;
import hw3.flight.Flight;

import java.util.Optional;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        try {
            Airline airline = new Airline("SWest");
            Airport origin = new Airport("MDW");
            Airport destination = new Airport("JAX");

            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByNumber(flightNumber);

            System.out.println(flight.get());
        } catch (NullParameterException exception) {
            exception.printStackTrace();
        } catch (BadParameterException exception) {
            exception.printStackTrace();
        }
    }
}
