package hw3.airline;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory() {};

    public static Airline getAirline(String name) {
        return airlineCache.computeIfAbsent(name, newName -> {
                return new Airline(name);
        });
    }

}
