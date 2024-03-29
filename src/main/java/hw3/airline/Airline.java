package hw3.airline;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;

import java.util.Objects;

public class Airline {
    private String name;


    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    public String getName() { return name; }

    private void setName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Airline name cannot be null");
        }
        if (aName.length() > 8) {
            throw new BadParameterException("Invalid name");
        }
        this.name = aName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %n", getName()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Airline other = (Airline) obj;
        if (!getName().equals(other.getName())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
