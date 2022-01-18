import java.util.Objects;

public class TravelManager {
    public static void main(String[] args) throws BadParameterException, NullParameterException {
        Airport origin = new Airport("ORD");
        Airport destination = new Airport("LAX");
        Airline airline = new Airline("SW");
        Flight flying = new Flight(airline, origin, destination);

        System.out.println(flying);
    }
}
