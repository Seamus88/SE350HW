import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private void setName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Null argument used in method setName");
        }
        if (aName.toUpperCase().trim().length() != 3) {
            throw new BadParameterException("Invalid argument used in method setName");
        }
        name = aName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport:", getName()));
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
