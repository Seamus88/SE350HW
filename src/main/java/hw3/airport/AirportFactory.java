package hw3.airport;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private static Map<String, Airport> airportCache = new HashMap<>();

    private AirportFactory() {};

    public static Airport getAirport(String name) {
        return airportCache.computeIfAbsent(name, newName -> {
            return new Airport(name);
        });
    }


}
