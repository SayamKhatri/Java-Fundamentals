package Level2.com.VehicleRentalSystem;

public abstract class Vehicle {
    private String name;
    private String color;

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    protected abstract double getRatePerDay();

}
