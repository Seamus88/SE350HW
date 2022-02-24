package hw3.airport;

import hw3.exceptions.BadParameterException;
import hw3.exceptions.NullParameterException;

import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name){
        setName(name);
    }

    private void setName(String aName){
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %n", getName()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if(!getName().equals(other.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
