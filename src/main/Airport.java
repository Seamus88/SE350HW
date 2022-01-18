

public class Airport {
    private String name;

    public Airport(String name) {
        setName(name);
    }

    private void setName(String aName) throws NullParameterException, BadParameterException {
        if (aName == null) {
            throw new NullParameterException("Null argument used in method setName");
        }
        if (aName.toUpper().trim().length() != 3) {
            throw new BadParameterException("Invalid argument used in method setName");
        }
        name = name;
    }

    public String getName() {
        return name;
    }

}
