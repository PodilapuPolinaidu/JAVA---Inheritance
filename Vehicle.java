package Inheritence;

public class Vehicle {
    private int no_of_doors, no_of_seats, no_of_types;
    private String name;
    private String transmission;

    private String engine;

    public int getNo_of_doors() {
        return no_of_doors;
    }

    public void setNo_of_doors(int no_of_doors) {
        this.no_of_doors = no_of_doors;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public int getNo_of_types() {
        return no_of_types;
    }

    public void setNo_of_types(int no_of_types) {
        this.no_of_types = no_of_types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
