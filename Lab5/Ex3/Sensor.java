package Lab5.Ex3;

public abstract class Sensor {
    private String location;

    abstract int readValue();

    public String getLocation() { return location; }

}
