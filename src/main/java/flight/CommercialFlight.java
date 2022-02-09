package flight;

import exceptions.NullParameterException;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;


    public CommercialFlight(Airline airline, Airport origine, Airport destination) throws NullParameterException {
        setAirline(airline);
        setOrigine(origine);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
    }

    public void setAirline(Airline aLine) throws NullParameterException {
        if (aLine == null) {
            throw new NullParameterException("Null value used in setAirline");
        }
        airline = aLine;
    }
    public Airline getAirline() {
        return airline;
    }

    public void setOrigine(Airport origin) throws NullParameterException {
        if (origin == null) {
            throw new NullParameterException("Null value used in setOrigine");
        }
        origine = origin;
    }
    public Airport getOrigine() {
        return origine;
    }

    public void setDestination(Airport destined) throws NullParameterException {
        if (destined == null) {
            throw new NullParameterException("Null value used in setOrigine");
        }
        destination = destined;
    }
    public Airport getDestination() {
        return destination;
    }


    public void setFlightNumber() {
        UUID uidFlight = UUID.randomUUID();
        flightNumber = uidFlight.toString();
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setDepartureTime() {
        long rangebegin = Timestamp.valueOf("2022-01-20 00:00:00").getTime();
        long rangeend = Timestamp.valueOf("2022-02-20 00:00:00").getTime();
        long diff = rangeend - rangebegin + 1;
        Timestamp rand = new Timestamp(rangebegin + (long)(Math.random() * diff));
        departureTime = rand;
    }
    public Date getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "flight.Airline:", getAirline().toString()));
        sb.append(String.format("%-20s %s%n", "Origine:", getOrigine().toString()));
        sb.append(String.format("%-20s %s%n", "Destination:", getDestination().toString()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure:", getDepartureTime().toString()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final CommercialFlight other = (CommercialFlight) obj;
        if(!getAirline().equals(other.getAirline())) {
            return false;
        }
        if (!getOrigine().equals(other.getOrigine())) {
            return false;
        }
        if (!getDestination().equals(other.getDestination())) {
            return false;
        }
        if (getFlightNumber().equals(other.getFlightNumber())) {
            return false;
        }
        return getDepartureTime() == other.getDepartureTime();
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origine, destination, flightNumber, departureTime);
    }

}
