import java.util.Date;

public class Flight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;


    public Flight(Airline airline, Airport origine, Airport destination, String flightNumber, Date departureTime) {
        this.airline = airline;
        this.origine = origine;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
    }


    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getOrigine() {
        return origine;
    }

    public void setOrigine(Airport origine) {
        this.origine = origine;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
