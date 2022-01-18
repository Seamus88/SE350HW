import java.util.Objects;

public class TravelManager {
    private Flight flight;

    public TravelManager(Flight flight) {
        setFlight(flight);
    }

    private void setFlight(Flight fli) {
        flight = fli;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final TravelManager other = (TravelManager) obj;
        if (!getFlight().equals(other.getFlight())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getFlight().toString();
    }

}
