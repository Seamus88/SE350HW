package hw3.flight;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassangerFlight implements Flight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;
    private int passengerCapacity;

    public PassangerFlight(Airline airline, Airport origine, Airport destination) throws NullParameterException, BadParameterException {
        setAirline(airline);
        setOrigine(origine);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
        setPassengerCapacity();
    }

    private void setPassengerCapacity() {
        this.passengerCapacity = 4;
    }
    public String getPassengerCapacity() {
        return Integer.toString(passengerCapacity);
    }

    public void setAirline(Airline aLine) throws NullParameterException {
        if (aLine == null) {
            throw new NullParameterException("Null value used in setAirline");
        }
        this.airline = aLine;
    }
    public String getAirline() {
        return airline.toString();
    }

    public void setOrigine(Airport origin) throws NullParameterException {
        if (origin == null) {
            throw new NullParameterException("Null value used in setOrigine");
        }
        this.origine = origin;
    }
    public String getOrigine() {
        return origine.toString();
    }

    public void setDestination(Airport destined) throws NullParameterException {
        if (destined == null) {
            throw new NullParameterException("Null value used in setOrigine");
        }
        this.destination = destined;
    }
    public String getDestination() {
        return destination.toString();
    }


    public void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }
    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public void setDepartureTime() {
        this.departureTime = new  Date(122, 06, 01, 12, 01);
    }
    public String getDepartureTime() {
        return departureTime.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s", "Airline:", getAirline()));
        sb.append(String.format("%-15s %s", "Origine:", getOrigine()));
        sb.append(String.format("%-15s %s", "Destination:", getDestination()));
        sb.append(String.format("%-15s %s%n", "Type:", "Passenger"));
        sb.append(String.format("%-15s %s%n", "Capacity:", getPassengerCapacity()));
        sb.append(String.format("%-15s %s%n", "Number:", getFlightNumber()));
        sb.append(String.format("%-15s %s%n", "Departure:", getDepartureTime()));
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
        return Objects.hash(airline, origine, destination, flightNumber, departureTime, passengerCapacity);
    }


}
