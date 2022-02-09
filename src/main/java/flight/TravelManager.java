package flight;

import exceptions.NullParameterException;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        FlightManager flightManager = new FlightManager().getInstance();
        flightManager.createFlight();
    }
}
