package Level2.com.VehicleRentalSystem;

public class Bike extends Vehicle {

    Bike(String name, String color) {
            super(name, color);
        }
    
    @Override
    protected double getRatePerDay() {
        return 100.0;
    }
    
}
