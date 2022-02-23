package flight.airline;

import flight.exceptions.BadParameterException;
import flight.exceptions.NullParameterException;

import java.util.Objects;

public class Airline {
    private String name;
    private final int MAX_NAME_LENGTH = 7;


    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    public String getName() { return name; }

    public void setName(String aName) throws NullParameterException, BadParameterException {
        if(aName == null) {
            throw new NullParameterException("Null argument used in setName");
        }
        if(aName.trim().length() > MAX_NAME_LENGTH) {
            throw new BadParameterException("Parameter value exceeded max length in setName");
        }
        name = aName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "flight.airline.Airline:", getName()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getName().equals(other.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
